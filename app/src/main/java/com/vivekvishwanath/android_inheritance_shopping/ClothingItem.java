package com.vivekvishwanath.android_inheritance_shopping;

public class ClothingItem extends ShoppingItem {

    private static final int colorId = R.color.clothingColor;
    private String material;

    public ClothingItem(int colorId, double price, String productName, String material) {
        super(colorId, price, productName);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getDisplayName() {
        return String.format("This %s was made using the material %s.", super.getDisplayName(),
                this.material);
    }
}
