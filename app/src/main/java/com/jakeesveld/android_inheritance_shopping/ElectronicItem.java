package com.jakeesveld.android_inheritance_shopping;

public class ElectronicItem extends ShoppingItem {


    public ElectronicItem(String name) {
        super(name);
    }

    @Override
    public int getColorId() {
        return R.color.colorAccent;
    }
}
