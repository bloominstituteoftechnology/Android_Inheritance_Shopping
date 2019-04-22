package com.example.israel.android_inheritance_shopping;

import android.graphics.Color;

public class TShirt extends ShoppingItem {

    public TShirt() {
        super(Color.WHITE, "TShirt");
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + ", size M";
    }
}
