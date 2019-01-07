package com.joshuahalvorson.android_inheritance_shopping;

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
import java.util.List;

public class ShoppingItemListActivity extends AppCompatActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private ArrayList<ShoppingItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingitem_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.shoppingitem_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        items = new ArrayList<>();
        items.add(new Dessert("Ice Cream"));
        items.add(new Electronics("Headphones"));
        items.add(new Dessert("Popsicles"));
        items.add(new Clothing("Hoodie"));
        items.add(new Electronics("Speaker"));
        items.add(new Clothing("T-Shirt"));
        items.add(new Dessert("Ice Cream Bars"));
        items.add(new Clothing("Shorts"));
        items.add(new Electronics("Camera"));
        items.add(new Clothing("Pants"));
        items.add(new Electronics("Video Game"));
        items.add(new Dessert("Pie"));
        items.add(new Electronics("Phone"));
        items.add(new Clothing("Shoes"));
        items.add(new Dessert("Cake"));

        View recyclerView = findViewById(R.id.shoppingitem_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(this, items, mTwoPane));
    }

    public static class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final ShoppingItemListActivity mParentActivity;
        private final List<ShoppingItem> mValues;
        private final boolean mTwoPane;

        SimpleItemRecyclerViewAdapter(ShoppingItemListActivity parent,
                                      List<ShoppingItem> items,
                                      boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.shoppingitem_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mIdView.setText(mValues.get(position).productName);
            holder.mContentView.setText(mValues.get(position).getDisplayName());
            holder.itemView.setTag(mValues.get(position));
            holder.parentView.setBackgroundColor(mValues.get(position).colorId);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;
            final LinearLayout parentView;

            ViewHolder(View view) {
                super(view);
                parentView = view.findViewById(R.id.parent_view);
                mIdView = view.findViewById(R.id.id_text);
                mContentView = view.findViewById(R.id.content);
            }
        }
    }
}
