package com.shoon.android_inheritance_shopping;


import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ViewHolder>{

    private ViewHolder viewHolder;
    private int i;
    public static final int EDIT_ENTRY_REQUEST_CODE = 2;
    private Context context;
    private ShoppingItemsList shoppingItems;


    public ListViewAdapter(ShoppingItemsList shoppingItems) {
        this.shoppingItems=shoppingItems;

    }
    public void set(ShoppingItemsList shoppingItems){
        this.shoppingItems=shoppingItems;
    }



    @NonNull

    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context=viewGroup.getContext();


        View entryView = LayoutInflater.from(context).inflate(R.layout.activity_list_view, viewGroup, false);


        return new ViewHolder(entryView);

    }


    @Override

    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {

        final ShoppingItem shoppingItem = this.shoppingItems.get(i);

        this.viewHolder=viewHolder;
        String strTemp=shoppingItem.getStrProductName();
        viewHolder.tvColor.setText(Integer.toString(shoppingItem.getiColor()));
        viewHolder.tvName.setText(strTemp);

    }

    public ShoppingItemsList getItemList(){
        return this.shoppingItems;
    }

    private void changeBackGroundColorAndCheckData(ViewHolder vh){

    }

    @Override

    public int getItemCount() {

        return shoppingItems.size();

    }

 //3.   Add a click listener to each board in the list

   class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
  //      class ViewHolder extends RecyclerView.ViewHolder {
        private CardView parent;


        private TextView tvName,tvColor;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            this.parent = itemView.findViewById(R.id.element_parent);

            this.tvColor = itemView.findViewById(R.id.textColorOfProductInList);

            this.tvName= itemView.findViewById(R.id.textNameProductInLIst);
            // Attach a click listener to the entire row view
           // itemView.setOnClickListener(this);

        }

        // Handles the row being being clicked
        @Override
        public void onClick(View view) {
            int position = getAdapterPosition(); // gets item position
            if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it

                changeBackGroundColorAndCheckData(this);
            }
        }


    }

}