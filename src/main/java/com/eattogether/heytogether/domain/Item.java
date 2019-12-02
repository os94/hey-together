package com.eattogether.heytogether.domain;

public class Item {
    private Menu menu;
    private int count;

    public Item(Menu menu, int count) {
        this.menu = menu;
        this.count = count;
    }
}
