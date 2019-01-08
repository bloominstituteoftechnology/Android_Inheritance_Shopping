package com.example.lambda_school_loaner_47.androidineritanceshopping;

import android.graphics.Color;

public class CampingItem extends ShoppingItem {
    private static int COLOR_ID = Color.WHITE;
    protected String hunting;

    protected CampingItem(int colorId, String productName) {
        super(colorId, productName);
        this.hunting = "Its sharp";
    }

    @Override
    public String getDisplayName() {
        super.getDisplayName();
        return hunting;
    }
}
