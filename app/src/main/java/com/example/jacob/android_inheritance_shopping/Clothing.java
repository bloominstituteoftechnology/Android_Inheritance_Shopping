package com.example.jacob.android_inheritance_shopping;

public class Clothing extends ShoppingItem {
    private String size;

    protected Clothing(int colorId, String name, String size) {
        super(colorId, name);
        this.size = size;
        this.colorId = (R.color.colorClothing);
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