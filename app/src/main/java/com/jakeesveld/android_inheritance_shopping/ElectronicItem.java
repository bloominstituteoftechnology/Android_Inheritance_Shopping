package com.jakeesveld.android_inheritance_shopping;

public class ElectronicItem extends ShoppingItem {

    private final int colorId = R.color.colorAccent;

    public ElectronicItem(String name) {
        super(name);
    }

    @Override
    public int getColorId() {
        return colorId;
    }
}
