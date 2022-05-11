package com.symplified.order;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.symplified.order.adapters.ProductsListAdapter;
import com.symplified.order.models.product.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    private RecyclerView productsrecyclerView;
    private ArrayList<Products> productsList;
    private static final String TAG = "ProductsActivity";

//    public ProductsActivity() {}

//    public ProductsActivity(int img, String name) {
//    }


    @Override
    protected void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.activity_products);

        init();
        generateData();
        setData();
    }

    private void init()
    {
        productsList = new ArrayList<>();
        productsrecyclerView = findViewById(R.id.productsRecyclerView);
    }

    private void generateData() {
        productsList.add(new Products(R.drawable.mob, "Mobile"));
        productsList.add(new Products(R.drawable.cam, "Camera"));
        productsList.add(new Products(R.drawable.leptop, "Leptop"));
        productsList.add(new Products(R.drawable.keyboard, "Keyboard"));
        productsList.add(new Products(R.drawable.mouse, "Mouse"));
        productsList.add(new Products(R.drawable.chair, "Chair"));
        productsList.add(new Products(R.drawable.table, "Table"));
        productsList.add(new Products(R.drawable.bike, "Bike"));
        productsList.add(new Products(R.drawable.tab, "Tablet"));
        productsList.add(new Products(R.drawable.lcd_81, "LCD"));
        productsList.add(new Products(R.drawable.mob, "Router"));
    }

    private void setData() {
        productsrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        productsrecyclerView.setAdapter(new ProductsListAdapter(this, productsList));
    }
}












//        RecyclerView productsRecyclerView = findViewById(R.id.productsRecyclerView);
//        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        String[] products = {"Leptop" , "Mobile" , "Mouse" , "Kayboard" , "Cell" , "Clock" , "Phone" , "Table" , "Chair" , "HeadPhones" , "Plate" , "Spoon" , "Board" , "Shoes" , "Glasses"};
//        productsRecyclerView.setAdapter(new ProductsListAdapter(products));


//    private void initData() {
//        productsList = new ArrayList<>();
//        productsList.add(new ProductsActivity(R.drawable.mob, "Mobile", "5"));
//        productsList.add(new ProductsActivity(R.drawable.cam, "Camera", "7"));
//        productsList.add(new ProductsActivity(R.drawable.leptop, "Leptop", "3"));
//        productsList.add(new ProductsActivity(R.drawable.keyboard, "Keyboard", "2"));
//        productsList.add(new ProductsActivity(R.drawable.mouse, "Mouse", "11"));
//        productsList.add(new ProductsActivity(R.drawable.chair, "Chair", "20"));
//        productsList.add(new ProductsActivity(R.drawable.table, "Table", "24"));
//        productsList.add(new ProductsActivity(R.drawable.bike, "Bike", "14"));
//        productsList.add(new ProductsActivity(R.drawable.tab, "Tablet", "55"));
//        productsList.add(new ProductsActivity(R.drawable.lcd_81, "LCD", "12"));
//        productsList.add(new ProductsActivity(R.drawable.mob, "Router", "1"));
//    }
//    private void initRecyclerView() {
//        precyclerView = findViewById(R.id.productsRecyclerView);
//        layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        precyclerView.setLayoutManager(layoutManager);
//        precyclerView.setAdapter(productsListAdapter);
//        productsListAdapter.notifyDataSetChanged();
//    }
