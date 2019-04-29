package com.shoon.android_inheritance_shopping;

import android.os.Parcel;

public class Shoes extends ShoppingItem {
    private int iSize;
    public Shoes(int iColor, String strProductName) {
        super(iColor, strProductName);
    }

    public Shoes(String strCSV) {
        super(strCSV);
    }

    protected Shoes(Parcel in) {
        super(in);
    }
}
