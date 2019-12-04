package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "orders")
    private List<Item> items;

    @ManyToOne
    private User user;

    @ManyToOne
    private Article article;

    public Orders() {
    }

    public Orders(List<Item> items, User user, Article article) {
        this.items = items;
        this.user = user;
        this.article = article;
    }
}
