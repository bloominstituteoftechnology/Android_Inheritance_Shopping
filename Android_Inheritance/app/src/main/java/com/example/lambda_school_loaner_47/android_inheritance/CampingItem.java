package com.example.lambda_school_loaner_47.android_inheritance;

import android.graphics.Color;

public class CampingItem extends ShoppingItem {
    private static int COLOR_ID = Color.WHITE;
    protected String hunting;

    protected CampingItem(int colorId, String productName) {
        super(COLOR_ID, productName);
        this.hunting = "Its sharp";
    }

    @Override
    public String getDisplayName() {
        super.getDisplayName();
        return hunting;
    }
}
