package com.symplified.order;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.symplified.order.models.product.Product;
import com.symplified.order.services.DownloadImageTask;
import com.symplified.order.utils.Utility;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ProductDetailsActivity extends AppCompatActivity {

    private Product product;
    private TextView prod_details_name , prod_details_price , prod_details_desc;
    private ImageView prod_details_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        prod_details_img = findViewById(R.id.prodDetails_Img);
        prod_details_name = findViewById(R.id.prodDetials_Name);
        prod_details_price = findViewById(R.id.prodDetails_Price);
        prod_details_desc = findViewById(R.id.prodDetails_Desc);

        Bundle data = getIntent().getExtras();
        product = (Product) data.getSerializable("product");

        prod_details_name.setText(product.name);
        prod_details_price.setText(String.format("%.2f", product.productInventories.get(0).price));
        prod_details_desc.setText(product.description);
        try {
            Bitmap bitmap = new DownloadImageTask().execute(product.thumbnailUrl).get();
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
                String encodedImage = Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.DEFAULT);
                if (encodedImage != null) {
                    Utility.decodeAndSetImage(prod_details_img, encodedImage);
                }
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
