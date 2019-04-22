package com.lambdaschool.android_inheritance_shopping;

public class Automotive extends ShoppingItem {
    private static final int COLOR_RESOURCE_ID = R.color.shopping_item_automotive;
    private boolean hazardousToEnvironment;

    public Automotive(String productName, boolean hazardousToEnvironment) {
        super(COLOR_RESOURCE_ID, productName);
        this.hazardousToEnvironment = hazardousToEnvironment;
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + (hazardousToEnvironment ? "Hazardous to the environment!" : "Safe for the environment.");
    }
}
