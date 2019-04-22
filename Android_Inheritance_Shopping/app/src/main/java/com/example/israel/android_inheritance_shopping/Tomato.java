package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class Tomato extends ShoppingItem {

    public static final int COLOR = Color.argb(255,200,50,50);

    public Tomato() {
        super(COLOR, "Tomato");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", refrigerate";
    }
}
