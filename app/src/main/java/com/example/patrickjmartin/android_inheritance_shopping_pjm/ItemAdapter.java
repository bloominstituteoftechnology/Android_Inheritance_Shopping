package com.example.patrickjmartin.android_inheritance_shopping_pjm;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout constLayout;
        private ImageView itemImage;
        private TextView itemDetails;
        private ProgressBar progressBar;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            constLayout = itemView.findViewById(R.id.parent_view_searched_items);
            itemImage = itemView.findViewById(R.id.searched_items_image);
            itemDetails = itemView.findViewById(R.id.searched_items_details);
            progressBar = itemView.findViewById(R.id.progressBar);

        }
    }

    private ArrayList<ShoppingItem> searcheditems;

    private Context context;
    private Activity activity;

    public ItemAdapter(ArrayList<ShoppingItem> items, Activity activity) {
        this.searcheditems = items;
        this.activity = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.shopping_item_layout,
                viewGroup,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {
        final Object b = searcheditems.get(i);

        final String displayText = ((ShoppingItem) b).getDisplayName();

        holder.constLayout.setBackgroundColor(((ShoppingItem) b).getColorID());

        holder.itemDetails.setText(displayText);

        if (b.getClass() == Sources.class) {
            holder.itemImage.setImageResource(R.drawable.orb);
        } else if (b.getClass() == Rings.class) {
            holder.itemImage.setImageResource(R.drawable.ring);
        } else if (b.getClass() == Potions.class) {
            holder.itemImage.setImageResource(R.drawable.potion);
        }


    }

    @Override
    public int getItemCount() {
        return searcheditems.size();
    }
}

