package com.example.lambda_school_loaner_47.android_inheritance;

import android.graphics.Color;

public class ElectronicItem extends ShoppingItem {
    private static int COLOR_ID = Color.RED;
    protected String batteries;

    @Override
    public String getDisplayName() {
        super.getDisplayName();
        return batteries;
    }

    protected ElectronicItem(int colorId, String productName) {
        super(COLOR_ID, productName);
        this.batteries = "Make sure they're charged";
    }
}
