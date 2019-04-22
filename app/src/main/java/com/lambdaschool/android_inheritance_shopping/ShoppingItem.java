package com.lambdaschool.android_inheritance_shopping;

public class ShoppingItem {
    private int colorId;
    private String productName;

    protected ShoppingItem(int colorId, String productName) {
        this.colorId = colorId;
        this.productName = productName;
    }

    public String getDisplayName() {
        return this.productName + " & ";
    }
}
