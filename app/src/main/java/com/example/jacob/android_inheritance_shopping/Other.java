package com.example.jacob.android_inheritance_shopping;

public class Other extends ShoppingItem {
    private boolean ableToFitInCar;

    public Other(int colorId, String name, boolean ableToFitInCar) {
        super(colorId, name);
        this.ableToFitInCar = ableToFitInCar;
    }
}
