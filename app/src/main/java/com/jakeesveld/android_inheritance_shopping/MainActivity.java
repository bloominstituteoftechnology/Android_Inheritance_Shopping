package com.jakeesveld.android_inheritance_shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ShoppingListAdapter listAdapter;
    ArrayList<ShoppingItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemList = new ArrayList<>();
        listAdapter = new ShoppingListAdapter(itemList);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

        populateList();
    }

    public void populateList(){
        itemList.add(new ElectronicItem("Computer"));
        itemList.add(new FurnitureItem("Couch"));
        itemList.add(new GroceryItem("Bananas"));
        itemList.add(new GroceryItem("Apples"));
        itemList.add(new ElectronicItem("Camera"));
        itemList.add(new FurnitureItem("Desk"));
        itemList.add(new ElectronicItem("Monitor"));
        itemList.add(new GroceryItem("Poptarts"));
        itemList.add(new FurnitureItem("Chair"));
        listAdapter.notifyDataSetChanged();
    }
}
