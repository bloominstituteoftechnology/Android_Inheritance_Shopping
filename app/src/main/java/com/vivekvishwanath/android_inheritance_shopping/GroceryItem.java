package com.vivekvishwanath.android_inheritance_shopping;

public class GroceryItem extends ShoppingItem {
    private static final int colorId = R.color.groceryColor;
    private String expirationDate;

    public GroceryItem(int colorId, double price, String productName, String expirationDate) {
        super(colorId, price, productName);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDisplayName() {
        return String.format("Thus %s expires on %s", super.getDisplayName(), this.expirationDate);
    }
}
