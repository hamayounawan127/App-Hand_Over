package com.symplified.order;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.symplified.order.adapters.ProductsListAdapter;
import com.symplified.order.models.product.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity
{
    private RecyclerView productsrecyclerView;
    private ArrayList<Products> productsList;
    private static final String TAG = "ProductsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceStatus)
    {
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

    private void generateData()
    {
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

    private void setData()
    {
        productsrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        productsrecyclerView.setAdapter(new ProductsListAdapter(this, productsList));
    }
}