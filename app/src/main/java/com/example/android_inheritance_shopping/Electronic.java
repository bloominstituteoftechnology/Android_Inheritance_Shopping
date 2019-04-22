package com.example.android_inheritance_shopping;

public class Electronic extends  ShoppingItem {

    static final int colorId = android.R.color.holo_green_dark;

   public Electronic(){
       super(colorId,"Laptop");
   }

    @Override
    public String getDisplayName() {
        return "MSI "+super.getDisplayName();
    }
}

