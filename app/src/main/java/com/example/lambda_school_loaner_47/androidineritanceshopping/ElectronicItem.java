package com.example.lambda_school_loaner_47.androidineritanceshopping;

public class ElectronicItem extends ShoppingItem {
    protected int colorId;
    protected String batteries;

    protected ElectronicItem(int colorId, String productName) {
        super(colorId, productName);
    }
}
