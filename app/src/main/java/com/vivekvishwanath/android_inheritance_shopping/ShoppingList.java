package com.vivekvishwanath.android_inheritance_shopping;

import java.util.ArrayList;

public class ShoppingList {

    public static ArrayList<ShoppingItem> generateShoppingItems() {
        ArrayList<ShoppingItem> shoppingList = new ArrayList<>();
        ShoppingItem item = new GroceryItem(8.00, "Fresh Wheat Bread", "05/23/2019");
        shoppingList.add(item);
        item = new ElectronicsItem(2000.00, "Apple TV", "4K Resolution");
        shoppingList.add(item);
        item = new ElectronicsItem(600.00, "Asus VivoBook", "256GB SSD");
        shoppingList.add(item);
        item = new ClothingItem(60.00, "Levi's 501 Jeans", "Denim");
        shoppingList.add(item);
        item = new ClothingItem(200.00, "UNIQLO Winter Coat", "Wool");
        shoppingList.add(item);
        item = new ClothingItem(120.00, "Jordan Retro 1s", "Leather");
        shoppingList.add(item);
        item = new GroceryItem(5.00, "Coco Puffs Cereal", "03/11/2021");
        shoppingList.add(item);
        item = new GroceryItem(2.50, "Silk Almond Milk", "008/05/2019");
        shoppingList.add(item);
        item = new ElectronicsItem(1000.00, "Samsung Galaxy 10", "64GB");
        shoppingList.add(item);
        return shoppingList;
    }
}
