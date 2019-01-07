package com.joshuahalvorson.android_inheritance_shopping;

import android.graphics.Color;

public class Dessert extends ShoppingItem {
    static final int COLOR_ID = Color.GREEN;

    public Dessert(String productName){
        super(productName, COLOR_ID);
    }

    @Override
    public String getDisplayName() {
        return "Now on sale!";
    }
}
