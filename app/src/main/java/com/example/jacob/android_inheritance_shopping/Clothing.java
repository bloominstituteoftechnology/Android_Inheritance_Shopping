package com.example.jacob.android_inheritance_shopping;

public class Clothing extends ShoppingItem {
    private final int BACKGROUND_COLOR = R.color.colorClothing;

    private String size;


    public Clothing(int id, int colorId, String name, String size) {
        super(id, colorId, name);
        this.size = size;
        this.colorId = BACKGROUND_COLOR;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - Size: %s", this.name, this.size);
    }
}