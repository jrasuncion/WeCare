package com.example.thea.wecare;

import android.view.View;

public class Item {

    private String title/*, description*/;

    public Item(String title/*, String description*/) {
        this.title = title;
//        this.description = description;
    }

    public String getTitle() {
        return title;
    }
//
//    public String getDescription() {
//        return description;
//    }
}