package com.example.israel.android_inheritance_shopping;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingItemListAdapter extends RecyclerView.Adapter<ShoppingItemListAdapter.ViewHolder> {

    public ShoppingItemListAdapter(ArrayList<ShoppingItem> shoppingItems) {
        this.shoppingItems = shoppingItems;
    }

    private ArrayList<ShoppingItem> shoppingItems;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shopping_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ShoppingItem shoppingItem = shoppingItems.get(i);

        viewHolder.displayNameTextView.setBackgroundColor(shoppingItem.getColor());
        viewHolder.displayNameTextView.setText(shoppingItem.getDisplayName());
    }

    @Override
    public int getItemCount() {
        return shoppingItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            displayNameTextView = itemView.findViewById(R.id.text_view_shopping_item_display_name);
        }

        TextView displayNameTextView;
    }
}
