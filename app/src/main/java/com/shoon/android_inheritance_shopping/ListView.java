package com.shoon.android_inheritance_shopping;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ListView extends AppCompatActivity {
    private ShoppingItemsList itemsList;
    private RecyclerView entryRecyclerView;
    private ListViewAdapter ilaAdapter;
    private Context context;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        context = getApplicationContext();
        ReceiveData();

        ilaAdapter=new ListViewAdapter( itemsList );


        entryRecyclerView = findViewById(R.id.recycler_view);
        entryRecyclerView.setAdapter( ilaAdapter );
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation( LinearLayoutManager.VERTICAL );
        entryRecyclerView.setLayoutManager(linearLayoutManager);


        findViewById( R.id.button_send ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsList=ilaAdapter.getItemList();
                itemsList.save();
                sendData();
                finish();
            }
        } );

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        itemsList.save();
        sendData();
        finish();

    }

    private void sendData() {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("DATA_I_NEED",itemsList);

        startActivity(intent);

    }
    public void ReceiveData(){
        itemsList=(ShoppingItemsList)getIntent().getParcelableExtra("DATA_I_NEED");
        ListViewAdapter ila=new ListViewAdapter( itemsList );

    }

}
