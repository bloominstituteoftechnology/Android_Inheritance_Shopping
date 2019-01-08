package com.example.patrickjmartin.android_inheritance_shopping_pjm;

import android.graphics.Color;

public class Rings extends ShoppingItem {

    private static final int COLOR = Color.LTGRAY;
    private int yearForged;
    private String previousOwner;
    private boolean isCursed;

    public Rings( String productName, int yearForged, String previousOwner, boolean isCursed) {

        super(COLOR, productName);
        this.yearForged = yearForged;
        this.previousOwner = previousOwner;
        this.isCursed = isCursed;
    }

    @Override
    public String getDisplayName() {
        String ringDisplay = String.format("%s: " +
                        "\nYear Forged: %d" +
                        "\nPrevious Owner: %s" +
                        "\nCursed Ring?: %b",
                super.getDisplayName(),
                this.yearForged,
                this.previousOwner,
                this.isCursed);
        return ringDisplay;
    }
}
