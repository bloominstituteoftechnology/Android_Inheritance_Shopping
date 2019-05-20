package com.example.android_inheritance_shopping;

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
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ShoppingItem> shoppingItems = new ArrayList<>();
        shoppingItems.add(new Electronic());
        shoppingItems.add(new Clothing());
        shoppingItems.add(new Grocery());

        ListAdapter adapter = new ListAdapter(shoppingItems);
        recyclerView.setAdapter(adapter);

    }
}
