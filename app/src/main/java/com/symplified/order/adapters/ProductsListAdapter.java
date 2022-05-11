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

















//    private List<Products>productsList;
//    RelativeLayout relativeLayout;
//    ImageView prodImage;
//    TextView prodName;
//    TextView prodQuantity;
//
//    public int getItemCount() { return productsList.size(); }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        public ViewHolder(@NonNull View itemView) {
//
//            super(itemView);
//            prodImage = (ImageView) itemView.findViewById(R.id.prodImg);
//            prodName = (TextView) itemView.findViewById(R.id.prodName);
//            prodQuantity = (TextView) itemView.findViewById(R.id.prodQuantity);
//            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.productsRecyclerView);
//
//        }
//    }
//
//public ProductsListAdapter(List<Products> productsList) { this.productsList = productsList; }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        View view = inflater.inflate(R.layout.products_card, parent, false);
//        return new ViewHolder(view);
//    }
//
//    public void setData(int pimg, String name, String quantity) {
//       prodImage.setImageResource(pimg);
//        prodName.setText(name);
//        prodQuantity.setText(quantity);
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//
//        int pimg = productsList.get(position).getImageView();
//        String name = productsList.get(position).getName();
//        String quantity = productsList.get(position).getQuantity();
//
//
//    }
//}
//
