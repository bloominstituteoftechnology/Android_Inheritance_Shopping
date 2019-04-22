package com.lambdaschool.android_inheritance_shopping;

public class Bedroom extends ShoppingItem {
    private static final int COLOR_RESOURCE_ID = R.color.shopping_item_bedroom;
    private int threadCount;

    public Bedroom(String productName, int threadCount) {
        super(COLOR_RESOURCE_ID, productName);
        this.threadCount = threadCount;
    }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + this.threadCount + " threads per inch.";
    }
}
