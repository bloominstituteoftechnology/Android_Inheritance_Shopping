package com.example.myapplication;

public class GroceryItems extends ShoppingItem {


    protected GroceryItems(int colorId, String productName) {
        super(colorId, productName);
    }

    protected GroceryItems(String productName){
        this(R.color.colorGroceryItem, productName);
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + "- Gluten Free";
    }
}
