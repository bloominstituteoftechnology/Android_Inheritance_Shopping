package com.example.israel.android_inheritance_shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_shopping_item_list);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ShoppingItem> shoppingItems = new ArrayList<>();
        shoppingItems.add(new Tomato());
        shoppingItems.add(new TShirt());
        shoppingItems.add(new Laptop());

        ShoppingItemListAdapter adapter = new ShoppingItemListAdapter(shoppingItems);
        recyclerView.setAdapter(adapter);

    }
}
