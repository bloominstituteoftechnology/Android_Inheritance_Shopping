package com.example.myapplication;

public class Electronics extends ShoppingItem{

    protected Electronics(int colorId, String productName) {
        super(colorId, productName);
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + "- Batteries Not Included";
    }

    protected Electronics(String productName){
        this(R.color.colorElectronicItem, productName);
    }

}
