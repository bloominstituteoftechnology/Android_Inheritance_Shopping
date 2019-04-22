package com.jakeesveld.android_inheritance_shopping;

public class GroceryItem extends ShoppingItem {


    public GroceryItem(String name) {
        super(name);
    }
    @Override
    public int getColorId() {
        return R.color.colorPrimary;
    }
}
