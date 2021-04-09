package com.example.sizzlingbiteapprebuild.slidingNav.menu;

import android.view.ViewGroup;

public abstract class DrawerItem<T extends DrawerAdapter.DrawerViewHolder> {
    protected boolean isChecked;

    public abstract T createViewHolder(ViewGroup parent);

    public abstract void bindViewHolder(T holder);

    public DrawerItem<T> setChecked(boolean checked) {
        isChecked = checked;
        return this;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public boolean isSelectable() {
        return true;
    }
}