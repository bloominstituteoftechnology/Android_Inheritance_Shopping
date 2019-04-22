package com.example.myapplication;

public class Clothing extends ShoppingItem {
    protected Clothing(int colorId, String productName) {
        super(colorId, productName);
    }
    @Override
    public String getDisplayName() {
        return super.getDisplayName() + "- Size Small";
    }

    protected Clothing(String productName){
        this(R.color.colorClothingItem, productName);
    }

}
