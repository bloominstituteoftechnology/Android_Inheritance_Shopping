package com.example.jacob.android_inheritance_shopping;

import android.support.v4.content.res.ResourcesCompat;

public class Grocery extends ShoppingItem {
    private boolean needsRefrigeration;

    protected Grocery(int colorId, String name, boolean needsRefrigeration) {
        super(colorId, name);
        this.needsRefrigeration = needsRefrigeration;
        this.colorId = (R.color.colorGrocery);
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - Needs refrigerated: %s", this.name, needsRefrigeration ? "Yes" : "No");
    }
}
