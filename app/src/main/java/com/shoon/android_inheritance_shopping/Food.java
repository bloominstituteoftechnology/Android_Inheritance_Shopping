package com.shoon.android_inheritance_shopping;

import android.os.Parcel;

public class Food extends ShoppingItem {
    String strStorage;
    public Food(int iColor, String strProductName) {
        super(iColor, strProductName);
    }

    public Food(String strCSV) {
        super(strCSV);
    }

    protected Food(Parcel in) {
        super(in);
    }
}
