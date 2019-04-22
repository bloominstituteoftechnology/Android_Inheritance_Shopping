package com.example.myapplication;

public class ShoppingItem {
    private int colorId;
    private String productName;

    protected ShoppingItem(int colorId, String productName) {
        this.colorId = colorId;
        this.productName = productName;
    }

    public String getDisplayName() {
        return productName;
    }

    public int getColorId() {
        return colorId;
    }
}
