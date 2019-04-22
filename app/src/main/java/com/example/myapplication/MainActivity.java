package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ShoppingItemListAdapter listAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        listAdapter = new ShoppingItemListAdapter(mockData());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }


    public ArrayList<ShoppingItem> mockData(){

        ArrayList<ShoppingItem> shoppingItems = new ArrayList<>();
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        ArrayList<Clothing> clothing = new ArrayList<>();
        ArrayList<Electronics> electronics = new ArrayList<>();

        groceryItems.add(new GroceryItem("Tomato"));
        groceryItems.add(new GroceryItem("Cheese"));
        groceryItems.add(new GroceryItem("Apple"));
        groceryItems.add(new GroceryItem("Egg"));
        groceryItems.add(new GroceryItem("Bread"));
        groceryItems.add(new GroceryItem("Blueberries"));


        clothing.add(new Clothing("Shirt"));
        clothing.add(new Clothing("Pants"));
        clothing.add(new Clothing("Jeans"));
        clothing.add(new Clothing("Blouse"));
        clothing.add(new Clothing("Hat"));
        clothing.add(new Clothing("Speedo"));

        electronics.add(new Electronics("Television"));
        electronics.add(new Electronics("Radio"));
        electronics.add(new Electronics("Wifi Adapter"));
        electronics.add(new Electronics("RTX 2080"));
        electronics.add(new Electronics("Webcam"));
        electronics.add(new Electronics("MotherBoard"));


        shoppingItems.addAll(groceryItems);
        shoppingItems.addAll(clothing);
        shoppingItems.addAll(electronics);

        return shoppingItems;
    }
}


