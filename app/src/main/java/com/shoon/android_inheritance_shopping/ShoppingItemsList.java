package com.shoon.android_inheritance_shopping;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingItemsList implements Parcelable {
    ShoppingItemDAO shoppingItemDAO;
    String strID;

    Context context;
    ArrayList<ShoppingItem> alShoppingItems;

    protected ShoppingItemsList(Parcel in) {
        strID = in.readString();
        alShoppingItems = in.createTypedArrayList(ShoppingItem.CREATOR);
    }

    public static final Creator<ShoppingItemsList> CREATOR = new Creator<ShoppingItemsList>() {
        @Override
        public ShoppingItemsList createFromParcel(Parcel in) {
            return new ShoppingItemsList(in);
        }

        @Override
        public ShoppingItemsList[] newArray(int size) {
            return new ShoppingItemsList[size];
        }
    };

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;

    }

    public ArrayList<ShoppingItem> getAlShoppingItems() {
        return alShoppingItems;
    }

    public void setAlShoppingItems(ArrayList<ShoppingItem> alShoppingItems) {
        this.alShoppingItems = alShoppingItems;
    }

    public ShoppingItemsList(Context context, ArrayList<ShoppingItem> alShoppingItems) {
        this.context = context;
        this.alShoppingItems = alShoppingItems;

    }


    public ShoppingItemsList(Context contextTemp) {
        if(contextTemp==null)return;
        if(this.context==null){
            this.context=contextTemp;

            this.alShoppingItems=new ArrayList<>(1);
            shoppingItemDAO=new ShoppingItemDAO(contextTemp);
            alShoppingItems=shoppingItemDAO.readPreferance(this.alShoppingItems);
        }


    }



    public ShoppingItemsList(ArrayList<ShoppingItem> alShoppingItems) {
        this.alShoppingItems = alShoppingItems;

    }
    public void add(ShoppingItem shoppingItem){
        alShoppingItems.add(shoppingItem);
    }

    public ShoppingItem get(int iIndex){
        return alShoppingItems.get(iIndex);
    }
    public int size(){
        return alShoppingItems.size();
    }
    public void save(){
        shoppingItemDAO.writePreferance(this);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(strID);
        dest.writeTypedList(alShoppingItems);
    }
}
