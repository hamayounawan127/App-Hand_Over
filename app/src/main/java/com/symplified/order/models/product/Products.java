package com.symplified.order.models.product;



import java.io.Serializable;
import java.util.List;


public class Products {

    private int prodImageview;
    private String name;

    public Products(int pImg, String pName)
    {
        this.prodImageview = pImg;
        this.name = pName;
    }

    public int getProdImageview() { return prodImageview; }
    public String getProdName() {
        return name;
    }
}



