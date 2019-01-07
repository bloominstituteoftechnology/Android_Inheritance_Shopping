package com.example.patrickjmartin.android_inheritance_shopping_pjm;

public class Potions extends ShoppingItem {

    private int goldValue;
    private String brewedBy;
    private boolean isOffensive;

    public Potions(int colorID, String productName, int goldValue, String brewedBy, boolean isOffensive) {
        super(colorID, productName);
        this.goldValue = goldValue;
        this.brewedBy = brewedBy;
        this.isOffensive = isOffensive;
    }
}
