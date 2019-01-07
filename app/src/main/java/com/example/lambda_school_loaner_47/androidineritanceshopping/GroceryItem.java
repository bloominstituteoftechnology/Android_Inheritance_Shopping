package com.example.lambda_school_loaner_47.androidineritanceshopping;

public class GroceryItem extends ShoppingItem {
    protected int colorId;
    protected String drink;

    protected GroceryItem(int colorId, String productName) {
        super(colorId, productName);
    }
}
