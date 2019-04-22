package com.jakeesveld.android_inheritance_shopping;

public class GroceryItem extends ShoppingItem {

    private int colorId;

    public GroceryItem(String name) {
        super(name);
        colorId = R.color.colorPrimary;
        super.setColorId(colorId);
    }
}
