package com.jakeesveld.android_inheritance_shopping;

public class FurnitureItem extends ShoppingItem {

    private final int colorId = R.color.colorPrimaryDark;

    public FurnitureItem(String name) {
        super(name);

    }
    @Override
    public int getColorId() {
        return colorId;
    }

    @Override
    public String getName() {
        return (super.getName() + "(Furniture)");
    }
}
