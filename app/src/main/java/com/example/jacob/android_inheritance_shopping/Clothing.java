package com.example.jacob.android_inheritance_shopping;

public class Clothing extends ShoppingItem {
    private String size;

    public Clothing(int colorId, String name, String size) {
        super(colorId, name);
        this.size = size;
    }
}


