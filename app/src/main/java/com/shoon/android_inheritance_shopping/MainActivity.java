package com.shoon.android_inheritance_shopping;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private ShoppingItem ShoppingItem;
    private RecyclerView entryRecyclerView;
    private ListViewAdapter ilaAdapter;
    private Context context;
    private SharedPreferences preferences;
    private ShoppingItemsList shoppingItemsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();


        ReceiveData();
        if(shoppingItemsList==null){
            shoppingItemsList=new ShoppingItemsList(context);

        }




        findViewById(R.id.button_recyclerview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputData();
                sendData();
            }

        });

    }

    private void inputData(){
        EditText eta=findViewById(R.id.inputNameOfProduct),
                etb=(findViewById(R.id.inputColor));
        ShoppingItem shoppingItem=new ShoppingItem(Integer.parseInt(etb.getText().toString()),eta.getText().toString());
        shoppingItemsList.add(shoppingItem);
    }

    private void sendData() {
        if(shoppingItemsList.size()==0)return;
        Intent intent = new Intent(context, ListView.class);
        intent.putExtra("DATA_I_NEED",shoppingItemsList);
        //       fromOtherScreen=true;
        startActivityForResult(intent,1);

    }
    public void ReceiveData(){
        shoppingItemsList=(ShoppingItemsList)getIntent().getParcelableExtra("DATA_I_NEED");
        ListViewAdapter ila=new ListViewAdapter( shoppingItemsList );

    }


}