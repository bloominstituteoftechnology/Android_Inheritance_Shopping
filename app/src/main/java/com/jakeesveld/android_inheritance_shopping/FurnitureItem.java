package com.jakeesveld.android_inheritance_shopping;

public class FurnitureItem extends ShoppingItem {

    private int colorId;

    public FurnitureItem(String name) {
        super(name);
        colorId = R.color.colorPrimaryDark;
        super.setColorId(colorId);
    }
}
