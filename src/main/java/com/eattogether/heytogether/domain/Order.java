package com.eattogether.heytogether.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Order {
    @Column
    private List<Item> items;

    @ManyToOne
    private User orderer;

    @ManyToOne
    private Article article;

    public Order(List<Item> items, User orderer, Article article) {
        this.items = items;
        this.orderer = orderer;
        this.article = article;
    }
}
