package com.example.patrickjmartin.android_inheritance_shopping_pjm;

public class ShoppingItem {

    private int colorID;
    private String productName;

    public ShoppingItem(int colorID, String productName) {
        this.colorID = colorID;
        this.productName = productName;
    }

    public String getDisplayName() {
        return productName;
    }

    public int getColorID() {
        return colorID;
    }
}
