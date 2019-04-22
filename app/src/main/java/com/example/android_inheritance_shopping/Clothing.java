package com.example.android_inheritance_shopping;

import android.graphics.Color;

public class Clothing extends ShoppingItem {
    static final int colorId = Color.BLUE;

    public Clothing(){
        super(colorId,"shirt");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + " doesnt fit";
    }
}
