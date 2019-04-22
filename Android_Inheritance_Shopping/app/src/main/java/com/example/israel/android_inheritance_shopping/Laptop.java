package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class Laptop extends ShoppingItem {

    public Laptop() {
        super(Color.GRAY, "Laptop");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", color black";
    }
}
