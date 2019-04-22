package com.example.israel.android_inheritance_shopping;

public class ShoppingItem {

    protected ShoppingItem(int color, String name) {
        this.color = color;
        this.name = name;
    }

    private int color;
    private String name;

    public int getColor() {
        return color;
    }

    public String getDisplayName() {
        return name;
    }
}
