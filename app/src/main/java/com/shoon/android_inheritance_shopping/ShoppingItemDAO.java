package com.shoon.android_inheritance_shopping;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.Serializable;
import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class ShoppingItemDAO  {
    SharedPreferences preferences;
    Context context;
    SharedPreferences.Editor editor;

    public ShoppingItemDAO(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences("ShoppingItems", MODE_PRIVATE);
        editor = preferences.edit();

    }

    public void clearPreference() {
           editor.clear(); //to erase preference
           editor.commit();//to erase preference
    }



    public ArrayList<ShoppingItem> readPreferance(ArrayList<ShoppingItem> shoppingItems) {
        String strRetrieved = preferences.getString("IDS_FOR_SHOPPING", "");

        if (strRetrieved.equals("")) {

        } else {
            String[] strIDs =strRetrieved.split(",");
            for(int i=0;i<strIDs.length;i++){
                strRetrieved=preferences.getString( "ITEM_FOR_SHOPPING" + strIDs[i],"");
                if(strRetrieved==""){

                }else{
                    ShoppingItem shoppingItem=new ShoppingItem(strRetrieved);
                    shoppingItems.add(shoppingItem);
                }
            }
        }

        return shoppingItems;
    }


    public void writePreferance(ShoppingItemsList shoppingItemsList){
        int iSize=shoppingItemsList.size();
        String strIDs="";

        for(int i=0;i<iSize;i++) {
            String strIDTemp=shoppingItemsList.get( i ).getStrID();
            if(strIDTemp==""){
                strIDTemp=Long.toString(System.currentTimeMillis());
            }
            strIDs+=shoppingItemsList.get( i ).getStrID();
            if(i<iSize-1)strIDs+=",";
            editor.putString("ITEM_FOR_SHOPPING"+strIDTemp, shoppingItemsList.get( i ).getCSV());
            editor.apply();
        }

        editor.putString("IDS_FOR_SHOPPING", strIDs);
        editor.commit();
    }
}
