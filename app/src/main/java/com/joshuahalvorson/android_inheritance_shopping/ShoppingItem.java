package com.joshuahalvorson.android_inheritance_shopping;

public class ShoppingItem {
    String productName;
    int colorId;

    protected ShoppingItem(String productName, int colorId) {
        this.productName = productName;
        this.colorId = colorId;
    }

    public String getDisplayName(){
        return this.productName;
    }

}
