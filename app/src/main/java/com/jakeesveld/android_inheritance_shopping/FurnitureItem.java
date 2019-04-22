package com.jakeesveld.android_inheritance_shopping;

public class FurnitureItem extends ShoppingItem {


    public FurnitureItem(String name) {
        super(name);

    }
    @Override
    public int getColorId() {
        return R.color.colorPrimaryDark;
    }
}
