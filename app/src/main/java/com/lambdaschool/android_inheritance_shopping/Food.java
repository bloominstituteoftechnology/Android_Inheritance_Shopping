package com.lambdaschool.android_inheritance_shopping;

public class Food extends ShoppingItem {
    private static final int COLOR_RESOURCE_ID = R.color.shopping_item_food;
    private String expirationDate;

    protected Food(String productName, String expirationDate) {
        super(COLOR_RESOURCE_ID, productName);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + "Expires on " + this.expirationDate;
    }
}
