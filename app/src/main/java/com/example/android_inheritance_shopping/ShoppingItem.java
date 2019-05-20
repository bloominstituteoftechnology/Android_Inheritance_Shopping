package com.example.android_inheritance_shopping;

public class ShoppingItem {
    protected int colorId;
    protected String name;

    public String getDisplayName(){
        return name;
    }

    public ShoppingItem(int colorId, String name) {
        this.colorId = colorId;
        this.name = name;
    }
    public int getColorId(){
        return colorId;
    }
}
