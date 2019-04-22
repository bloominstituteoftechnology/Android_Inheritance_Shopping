package com.example.android_inheritance_shopping;

public class Grocery extends ShoppingItem {
    static final int colorId = android.R.color.holo_orange_dark;

   public Grocery(){
       super(colorId,"carrot");
   }

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + " from the frozen section";
    }
}
