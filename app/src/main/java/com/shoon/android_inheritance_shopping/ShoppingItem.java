package com.shoon.android_inheritance_shopping;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ShoppingItem implements Parcelable {

    int iColor;
    String strID,
            strProductName;

    public ShoppingItem(int iColor, String strProductName) {
        this.iColor = iColor;
        this.strProductName = strProductName;
        this.strID="";
    }

    public ShoppingItem(String strCSV) {
        String[] strarTemp=strCSV.split(",");
        this.strID=strarTemp[0];
        this.strProductName = strarTemp[1];
        this.iColor = Integer.parseInt(strarTemp[2]);
    }

    protected ShoppingItem(Parcel in) {
        iColor = in.readInt();
        strID = in.readString();
        strProductName = in.readString();
    }

    public static final Creator<ShoppingItem> CREATOR = new Creator<ShoppingItem>() {
        @Override
        public ShoppingItem createFromParcel(Parcel in) {
            return new ShoppingItem(in);
        }

        @Override
        public ShoppingItem[] newArray(int size) {
            return new ShoppingItem[size];
        }
    };

    public String getCSV() {
        String strCSV="\"";
        strCSV=this.strID;
        strCSV+="\",\"";
        strCSV+=this.strProductName;
        strCSV+="\",\"";
        strCSV+= Integer.toString(this.iColor);
        strCSV+="\"";
        return strCSV;
    }


    public int getiColor() {

        return iColor;
    }

    public void setiColor(int iColor) {
        this.iColor = iColor;
    }

    public String getStrProductName() {
        return strProductName;
    }

    public void setStrProductName(String strProductName) {
        this.strProductName = strProductName;
    }

    public String getStrID() {
        return strID;
    }

    public void setStrID(String strID) {
        this.strID = strID;
    }

    String getDisplayName(){
        return strProductName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(iColor);
        dest.writeString(strID);
        dest.writeString(strProductName);
    }
}
