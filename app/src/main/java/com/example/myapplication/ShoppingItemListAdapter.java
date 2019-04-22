package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingItemListAdapter extends RecyclerView.Adapter<ShoppingItemListAdapter.ViewHolder>{

    ArrayList<ShoppingItem> mValues;


    public ShoppingItemListAdapter(ArrayList<ShoppingItem> values){
        this.mValues = values;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView shoppingItemTitle;
        View parentView;
        CardView cv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            shoppingItemTitle = itemView.findViewById(R.id.tv_shopping_item_title);
            parentView = itemView.findViewById(R.id.recycler_view);
            cv = itemView.findViewById(R.id.shopping_item);

        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_item_layout, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ShoppingItem data = mValues.get(i);


        viewHolder.cv.setCardBackgroundColor(viewHolder.shoppingItemTitle.getContext().getResources().getColor(data.getColorId()));
        viewHolder.shoppingItemTitle.setText(data.getDisplayName());

    }

    @Override
    public int getItemCount() {
        return this.mValues.size();
    }
}
