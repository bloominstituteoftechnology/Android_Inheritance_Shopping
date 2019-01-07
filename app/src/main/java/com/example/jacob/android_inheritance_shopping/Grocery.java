package com.example.jacob.android_inheritance_shopping;

import android.support.v4.content.res.ResourcesCompat;

public class Grocery extends ShoppingItem {
    private boolean needsRefrigeration;

    public Grocery(int id, int colorId, String name, boolean needsRefrigeration) {
        super(id, colorId, name);
        this.needsRefrigeration = needsRefrigeration;
        this.colorId = (R.color.colorGrocery);
    }

    public boolean getNeedsRefrigeration() {
        return needsRefrigeration;
    }

    public void setNeedsRefrigeration(boolean needsRefrigeration) {
        this.needsRefrigeration = needsRefrigeration;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - Needs refrigerated: %s", this.name, needsRefrigeration ? "Yes" : "No");
    }
}
