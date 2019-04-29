package com.shoon.android_inheritance_shopping;

import android.os.Parcel;

public class Clothes extends ShoppingItem {
    private String strSize;


    public Clothes(int iColor, String strProductName) {
        super(iColor, strProductName);
    }

    public Clothes(String strCSV) {
        super(strCSV);
    }

    protected Clothes(Parcel in) {
        super(in);
    }
}
