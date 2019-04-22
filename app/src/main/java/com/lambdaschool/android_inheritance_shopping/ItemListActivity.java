package com.lambdaschool.android_inheritance_shopping;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ItemDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ItemListActivity extends AppCompatActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    private ArrayList<ShoppingItem> shoppingItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if (findViewById(R.id.item_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        View recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        populateShoppingBag();
        setupRecyclerView((RecyclerView) recyclerView);
    }

    private void populateShoppingBag() {
        shoppingItemArrayList = new ArrayList<>();
        shoppingItemArrayList.add(new Food("Milk", "Tuesday"));
        shoppingItemArrayList.add(new Automotive("Oil", true));
        shoppingItemArrayList.add(new Bedroom("Sheets", 300));
        shoppingItemArrayList.add(new Food("Cheese", "Friday"));
        shoppingItemArrayList.add(new Automotive("Brake Fluid", true));
        shoppingItemArrayList.add(new Bedroom("Towels", 150));
        shoppingItemArrayList.add(new Food("Jam", "December"));
        shoppingItemArrayList.add(new Automotive("Headlights", false));
        shoppingItemArrayList.add(new Bedroom("Curtains", 50));
        shoppingItemArrayList.add(new Food("Apples", "Sunday"));
        shoppingItemArrayList.add(new Automotive("Air Freshener", false));
        shoppingItemArrayList.add(new Bedroom("Nightstand Lamp", 0));
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(this, shoppingItemArrayList, mTwoPane));
    }

    public static class SimpleItemRecyclerViewAdapter extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final ItemListActivity mParentActivity;
        private final ArrayList<ShoppingItem> mValues;
        private final boolean mTwoPane;
        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShoppingItem item = (ShoppingItem) view.getTag();
                if (mTwoPane) {
                    Bundle arguments = new Bundle();
                    arguments.putSerializable(ItemDetailFragment.ARG_ITEM_ID, item);
                    ItemDetailFragment fragment = new ItemDetailFragment();
                    fragment.setArguments(arguments);
                    mParentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.item_detail_container, fragment).commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ItemDetailActivity.class);
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, item);
                    context.startActivity(intent);
                }
            }
        };

        SimpleItemRecyclerViewAdapter(ItemListActivity parent, ArrayList<ShoppingItem> items, boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            ShoppingItem shoppingItem = mValues.get(position);
            holder.mIdView.setText(shoppingItem.getColorId());
            holder.mContentView.setText(shoppingItem.getDisplayName());
            holder.mParentLayout.setBackgroundResource(shoppingItem.getColorId());
            holder.itemView.setTag(shoppingItem);
            holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;
            final LinearLayout mParentLayout;

            ViewHolder(View view) {
                super(view);
                mIdView = view.findViewById(R.id.text1);
                mContentView = view.findViewById(R.id.text2);
                mParentLayout = view.findViewById(R.id.parent);
            }
        }
    }
}
