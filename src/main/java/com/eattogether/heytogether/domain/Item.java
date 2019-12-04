package com.eattogether.heytogether.domain;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

    private int count;

    public Item() {
    }

    public Item(Menu menu, int count) {
        this.menu = menu;
        this.count = count;
    }
}
