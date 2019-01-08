package com.example.patrickjmartin.android_inheritance_shopping_pjm;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Activity activity;

    private RecyclerView itemRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private ItemAdapter itemAdapter;

    private ArrayList<ShoppingItem> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter = generateValue();

        itemRecyclerView = findViewById(R.id.searched_items_recyclerview);
        itemRecyclerView.setHasFixedSize(true);

        gridLayoutManager = new GridLayoutManager(context, 2);
        itemRecyclerView.setLayoutManager(gridLayoutManager);

        itemAdapter = new ItemAdapter(arrayAdapter, activity);

        itemRecyclerView.setAdapter(itemAdapter);



    }

    public static ArrayList<ShoppingItem> generateValue(){

        ArrayList<ShoppingItem> returnAList = new ArrayList<>();

        Potions reverseHealing = new Potions("Reverse Healing Potion", 666,
                "The Devil Himself", 66.666f);
        Rings oneRing = new Rings("The One Ring", 1600,
                "Frodo", true );
        Sources glare = new Sources("Tal Rasha's Unwavering Glare", 60,
                "+5% Elemental Damage, Meteors fall from the sky", true);

        ShoppingItem blah = new ShoppingItem(Color.WHITE, "Nothing");

        returnAList.add(reverseHealing);
        returnAList.add(oneRing);
        returnAList.add(glare);
        returnAList.add(blah);


        return returnAList;
    }

}
