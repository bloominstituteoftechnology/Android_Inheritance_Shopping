package com.example.jacob.android_inheritance_shopping;

public class Other extends ShoppingItem {
    private boolean needsTruck;

    protected Other(int colorId, String name, boolean needsTruck) {
        super(colorId, name);
        this.needsTruck = needsTruck;
        this.colorId = (R.color.colorOther);
    }

    public boolean getNeedsTruck() {
        return needsTruck;
    }

    public void setNeedsTruck(boolean needsTruck) {
        this.needsTruck = needsTruck;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s - requires truck: %s", this.name, needsTruck ? "Yes" : "No");
    }
}
