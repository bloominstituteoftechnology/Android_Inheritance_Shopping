package com.example.jacob.android_inheritance_shopping;

public class Clothing extends ShoppingItem {
    private String size;

    protected Clothing(int colorId, String name, String size) {
        super(colorId, name);
        this.size = size;
        this.colorId = (R.color.colorClothing);
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - Size: %s", this.name, this.size);
    }
}


