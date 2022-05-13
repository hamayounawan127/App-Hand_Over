package com.symplified.order;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.messaging.FirebaseMessaging;
import com.symplified.order.adapters.ProductsListAdapter;
import com.symplified.order.apis.ProductApi;
import com.symplified.order.models.product.Product;
import com.symplified.order.models.product.ProductResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsActivity extends AppCompatActivity
{
    private Toolbar toolbar;
//    private Button productDetailsBtn;

    private RecyclerView productsrecyclerView;
    List<Product> productsList = new ArrayList<>();
    ProductsListAdapter productsListAdapter;
    private static final String TAG = "ProductsActivity";
    private SharedPreferences sharedPreferences;
    private String storeId;

    @Override
    protected void onCreate(Bundle savedInstanceStatus)
    {
        sharedPreferences = getApplicationContext().getSharedPreferences(App.SESSION_DETAILS_TITLE, MODE_PRIVATE);
        storeId = sharedPreferences.getString("storeId", null);
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.activity_products);
        toolbar = findViewById(R.id.toolbar);
        productsrecyclerView = findViewById(R.id.productsRecyclerView);
        initToolbar(sharedPreferences);

//        init();
//        generateData();
        setData();
        getProductsList();
    }

    private void initToolbar(SharedPreferences sharedPreferences)
    {
        ImageView home = toolbar.findViewById(R.id.app_bar_home);
        home.setImageDrawable(getDrawable(R.drawable.ic_home_black_24dp));
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                setResult(4, new Intent().putExtra("finish", 1));
//                Intent intent = new Intent(getApplicationContext(), ChooseStore.class);
//                FirebaseMessaging.getInstance().unsubscribeFromTopic(sharedPreferences.getString("storeId", null));
//                sharedPreferences.edit().remove("storeId").apply();
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//                finish();
                finish();
            }
        });

        ImageView logout = toolbar.findViewById(R.id.app_bar_logout);
        logout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                String storeIdList = sharedPreferences.getString("storeIdList", null);
                if(storeIdList != null )
                {
                    for(String storeId : storeIdList.split(" "))
                    {
                        FirebaseMessaging.getInstance().unsubscribeFromTopic(storeId);
                    }
                }
                sharedPreferences.edit().clear().apply();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        ImageView settings = toolbar.findViewById(R.id.app_bar_settings);
        settings.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(intent);
        });

        ImageView products = toolbar.findViewById(R.id.app_bar_products);
        products.setOnClickListener(view -> {
            Toast.makeText(this, "Opened!", Toast.LENGTH_SHORT).show();
        });

//        ImageView productsDetailsBtn = productDetailsBtn.findViewById(R.id.product_Details_Btn);
//        productsDetailsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    private void getProductsList()
    {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer Bearer accessToken");
        Retrofit retrofit = new Retrofit.Builder().client(new OkHttpClient())
                .baseUrl("https://api.symplified.it/product-service/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi api = retrofit.create(ProductApi.class);
        Call<ProductResponse> responseCall = api.getProducts(headers, storeId);

        responseCall.clone().enqueue(new Callback<ProductResponse>()
        {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response)
            {
                if (response.isSuccessful())
                {
                    productsList.addAll(response.body().data.content);
                    productsListAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t)
            {

            }
        });
    }

    private void setData()
    {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        productsrecyclerView.setLayoutManager(linearLayoutManager);
        productsListAdapter = new ProductsListAdapter(this, productsList);
        productsrecyclerView.setAdapter(productsListAdapter);
    }
}