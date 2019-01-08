package com.example.lambda_school_loaner_47.androidineritanceshopping;

public class ShoppingItem {
    protected int colorId;
    protected String productName;

    protected ShoppingItem(int colorId, String productName) {
        this.colorId = colorId;
        this.productName = productName;
    }

    public String getDisplayName(){
        return this.productName;
    }
}
