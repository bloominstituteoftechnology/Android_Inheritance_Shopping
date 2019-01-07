package com.example.jacob.android_inheritance_shopping;

public class Grocery extends ShoppingItem {
    private boolean needsRefrigeration;

    public Grocery(int colorId, String name, boolean needsRefrigeration) {
        super(colorId, name);
        this.needsRefrigeration = needsRefrigeration;
    }
}
