package com.example.lambda_school_loaner_47.android_inheritance;

import android.graphics.Color;

public class GroceryItem extends ShoppingItem {


    private static int COLOR_ID = Color.BLUE;
    protected String drink;

    protected GroceryItem(String productName) {
        super(COLOR_ID, productName);
        this.drink = "It's cold";

    }


    @Override
    public String getDisplayName() {

        super.getDisplayName();
        return drink;
    }
}
