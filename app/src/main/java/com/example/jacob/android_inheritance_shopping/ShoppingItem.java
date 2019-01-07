package com.example.jacob.android_inheritance_shopping;

public class ShoppingItem {
    int id;
    int colorId;
    String name;

    public ShoppingItem(int id, int colorId, String name) {
        this.id = id;
        this.colorId = colorId;
        this.name = name;
    }
    public ShoppingItem() {}

    public int getId() {
        return id;
    }

    public int getColorId() {
        return colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return this.name;
    }

}
