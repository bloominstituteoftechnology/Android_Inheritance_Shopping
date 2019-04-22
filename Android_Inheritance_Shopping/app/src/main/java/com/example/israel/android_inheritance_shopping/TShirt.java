package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class TShirt extends ShoppingItem {

    public static final int COLOR = Color.WHITE;

    public TShirt() {
        super(COLOR, "TShirt");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", size M";
    }
}
