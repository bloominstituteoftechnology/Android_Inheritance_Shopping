package com.example.myapplication;

public class GroceryItem extends ShoppingItem {


    protected GroceryItem(int colorId, String productName) {
        super(colorId, productName);
    }

    protected GroceryItem(String productName){
        this(R.color.colorGroceryItem, productName);
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + "- Gluten Free";
    }
}
