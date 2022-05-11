package com.symplified.order.adapters;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.symplified.order.R;
import com.symplified.order.models.product.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsListAdapter extends RecyclerView.Adapter<ProductsListAdapter.ViewHolder> {

    private Context context;
        private ArrayList<Products>productsList;

        public ProductsListAdapter (Context context, ArrayList<Products> productsList)
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
        Products products = productsList.get(position);
        holder.setProdIcon(products.getProdImageview());
        holder.setProdTitle(products.getProdName());
    }

    @Override
    public int getItemCount() {return productsList == null ? 0 : productsList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView prodTitle;
        ImageView prodIcon;
        RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.prodTitle = itemView.findViewById(R.id.prodName);
            this.prodIcon = itemView.findViewById(R.id.prodImg);
            this.relativeLayout = itemView.findViewById(R.id.productsRecyclerView);
        }

        public void setRelativeLayout(RelativeLayout relativeLayout) { this.relativeLayout = relativeLayout; }

        public void setProdTitle(String prodName) { this.prodTitle = prodTitle; }

        public void setProdIcon(int prodImageview) { this.prodIcon = prodIcon; }
    }
}