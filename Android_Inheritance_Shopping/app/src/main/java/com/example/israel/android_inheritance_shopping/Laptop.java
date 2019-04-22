package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class Laptop extends ShoppingItem {

    public static final int COLOR = Color.GRAY;

    public Laptop() {
        super(COLOR, "Laptop");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", color black";
    }
}
