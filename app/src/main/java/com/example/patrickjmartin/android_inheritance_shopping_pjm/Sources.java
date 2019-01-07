package com.example.patrickjmartin.android_inheritance_shopping_pjm;

import android.graphics.Color;

public class Sources extends ShoppingItem{

    private static final int COLOR = Color.YELLOW;
    private int reqMana;
    private String magicalProperty;
    private boolean isSentient;

    public Sources(String productName, int reqMana, String magicalProperties, boolean isSentient) {

        super(COLOR, productName);
        this.reqMana = reqMana;
        this.magicalProperty = magicalProperties;
        this.isSentient = isSentient;
    }

    @Override
    public String getDisplayName() {
        String sourceDisplay = String.format("%s: " +
                "\nRequired Mana: %d" +
                "\nMagical Property: %s" +
                "\nLiving Weapon: %b",
                super.getDisplayName(),
                this.reqMana,
                this.magicalProperty,
                this.isSentient);
        return sourceDisplay;
    }
}
