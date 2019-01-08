package com.example.jacob.android_inheritance_shopping;

import android.support.v4.content.res.ResourcesCompat;

public class Grocery extends ShoppingItem {
    private boolean needsRefrigeration;
    private final int BACKGROUND_COLOR = R.color.colorGrocery;

    public Grocery(int id, int colorId, String name, boolean needsRefrigeration) {
        super(id, colorId, name);
        this.needsRefrigeration = needsRefrigeration;
        this.colorId = BACKGROUND_COLOR;
    }


    public boolean getNeedsRefrigeration() {
        return needsRefrigeration;
    }

    public void setNeedsRefrigeration(boolean needsRefrigeration) {
        this.needsRefrigeration = needsRefrigeration;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - Needs Refrigerated: %s", this.name, needsRefrigeration ? "Yes" : "No");
    }
}
