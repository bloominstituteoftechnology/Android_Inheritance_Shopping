package com.vivekvishwanath.android_inheritance_shopping;

public class ElectronicsItem extends ShoppingItem {

    private static final int colorId = R.color.electronicsColor;
    private String specs;


    protected ElectronicsItem(double price, String productName, String specs) {
        super(colorId, price, productName);
        this.specs = specs;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Override
    public String getDisplayName() {
        return String.format("This %s has the following specifications: %s", super.getDisplayName(),
                this.specs);
    }
}
