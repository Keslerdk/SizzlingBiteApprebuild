package com.example.sizzlingbiteapprebuild.slidingNav.fragments.dashboard;

public class DynamicRvModel {
    private String name;
    private int image;
    private int pos;

    public DynamicRvModel(String name, int image, int pos) {
        this.name = name;
        this.image = image;
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getPos() {
        return pos;
    }
}
