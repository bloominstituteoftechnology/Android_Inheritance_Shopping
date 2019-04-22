package com.jakeesveld.android_inheritance_shopping;

public class GroceryItem extends ShoppingItem {

    private final int colorId = R.color.colorPrimary;

    public GroceryItem(String name) {
        super(name);
    }
    @Override
    public int getColorId() {
        return colorId;
    }

    @Override
    public String getName() {
        return (super.getName() + "(Grocery)");
    }
}
