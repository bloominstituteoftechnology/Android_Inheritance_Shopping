package com.example.patrickjmartin.android_inheritance_shopping_pjm;

import android.graphics.Color;

public class Potions extends ShoppingItem {

    private static int COLOR = Color.RED;
    private int goldValue;
    private String brewedBy;
    private float toxicityLevel;

    public Potions(String productName, int goldValue, String brewedBy, float toxicityLevel) {
        super(this.COLOR, productName);
        this.goldValue = goldValue;
        this.brewedBy = brewedBy;
        this.toxicityLevel = toxicityLevel;
    }

    @Override
    public String getDisplayName() {
        String potionDisplay = String.format("%s: " +
                        "\nGold Value: %d" +
                        "\nBrewed by: %s" +
                        "\nToxicity Levels: %f",
                super.getDisplayName(),
                this.goldValue,
                this.brewedBy,
                this.toxicityLevel);
        return potionDisplay;
    }
}
