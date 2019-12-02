package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Shop shop;

    @Column(nullable = false)
    private Place orderPlace;

    @Column(nullable = false)
    private LocalDateTime deadline;

    @OneToMany
    @Column(nullable = false)
    private List<Order> orders;

    @ManyToOne
    @Column(nullable = false)
    private User author;

    public Article(Shop shop, Place orderPlace, LocalDateTime deadline, List<Order> orders, User author) {
        this.shop = shop;
        this.orderPlace = orderPlace;
        this.deadline = deadline;
        this.orders = orders;
        this.author = author;
    }
}
