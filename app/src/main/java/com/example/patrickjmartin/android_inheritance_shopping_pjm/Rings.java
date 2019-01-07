package com.example.patrickjmartin.android_inheritance_shopping_pjm;

public class Rings extends ShoppingItem {

    private int yearForged;
    private String previousOwner;
    private boolean isCursed;

    public Rings(int colorID, String productName, int yearForged, String previousOwner, boolean isCursed) {
        super(colorID, productName);
        this.yearForged = yearForged;
        this.previousOwner = previousOwner;
        this.isCursed = isCursed;
    }

}
