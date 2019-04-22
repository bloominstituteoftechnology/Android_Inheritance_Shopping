package com.lambdaschool.android_inheritance_shopping;

import java.io.Serializable;

public class ShoppingItem implements Serializable {
    private int colorId;
    private String productName;

    protected ShoppingItem(int colorId, String productName) {
        this.colorId = colorId;
        this.productName = productName;
    }

    public String getDisplayName() {
        return this.productName + " & ";
    }

    public int getColorId() {
        return colorId;
    }

    public String getProductName() {
        return productName;
    }
}
