package com.jakeesveld.android_inheritance_shopping;

public class ElectronicItem extends ShoppingItem {

    private int colorId;

    public ElectronicItem(String name) {
        super(name);
        colorId = R.color.colorAccent;
        super.setColorId(colorId);
    }
}
