package com.joshuahalvorson.android_inheritance_shopping;

import android.graphics.Color;

public class Electronics extends ShoppingItem {
    static final int COLOR_ID = Color.YELLOW;

    public Electronics(String productName){
        super(productName, COLOR_ID);
    }

    @Override
    public String getDisplayName() {
        return "Comes with a 1 year warranty!";
    }
}
