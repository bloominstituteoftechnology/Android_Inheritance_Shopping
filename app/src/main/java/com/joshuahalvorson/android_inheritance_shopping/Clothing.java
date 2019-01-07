package com.joshuahalvorson.android_inheritance_shopping;

import android.graphics.Color;

public class Clothing extends ShoppingItem{
    static final int COLOR_ID = Color.BLUE;

    public Clothing(String productName){
        super(productName, COLOR_ID);
    }

    @Override
    public String getDisplayName() {
        return "New items in stock!";
    }
}
