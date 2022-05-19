package com.symplified.order.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.symplified.order.ProductDetailsActivity;
import com.symplified.order.R;
import com.symplified.order.models.product.Product;
import com.symplified.order.services.DownloadImageTask;
import com.symplified.order.utils.Utility;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ProductsListAdapter extends RecyclerView.Adapter<ProductsListAdapter.ViewHolder> {

    private Context context;
        private List<Product>productsList;

        public ProductsListAdapter (Context context, List<Product> productsList)
        {
            this.context = context;
            this.productsList = productsList;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.products_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
//        try {
//            Bitmap bitmap = new DownloadImageTask().execute(productsList.get(position).thumbnailUrl).get();
//            if (bitmap != null) {
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
//                String encodedImage = Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.DEFAULT);
//                if (encodedImage != null) {
//                    Utility.decodeAndSetImage(holder.prodIcon, encodedImage);
//                }
//            }
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        holder.prodTitle.setText(productsList.get(position).getName());
//        holder.prodPrice.setText(new Double(productsList.get(position).productInventories.get(0).price).toString());
        holder.prodPrice.setText(String.format("%.2f", productsList.get(position).productInventories.get(0).price));

        holder.prod_cardView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), ProductDetailsActivity.class);
            intent.putExtra("product", productsList.get(position));
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {return productsList == null ? 0 : productsList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView prodTitle;
        TextView prodPrice;
        ImageView prodIcon;
        CardView prod_cardView;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.prodTitle = itemView.findViewById(R.id.prodName);
            this.prodPrice = itemView.findViewById(R.id.prodPrice);
            this.prodIcon = itemView.findViewById(R.id.prodImg);
            this.prod_cardView = itemView.findViewById(R.id.product_card_parent);
        }

    }
}