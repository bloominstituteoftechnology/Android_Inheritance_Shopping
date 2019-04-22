package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class Tomato extends ShoppingItem {

    public Tomato() {
        super(Color.argb(255,200,50,50), "Tomato");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", refrigerate";
    }
}
