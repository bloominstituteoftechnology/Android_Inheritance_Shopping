package com.vivekvishwanath.android_inheritance_shopping;

public class ShoppingItem {

    private static int colorId;
    private double price;
    private String productName;

    protected ShoppingItem(int colorId, double price, String productName) {
        this.colorId = colorId;
        this.price = price;
        this.productName = productName;
    }

    public static int getColorId() {
        return colorId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDisplayName() {
        return productName;
    }



}
