package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Shop shop;

    @OneToOne
    private Place orderPlace;

    @Column(nullable = false)
    private LocalDateTime deadline;

    @OneToMany(mappedBy = "article")
    private List<Orders> orders;

    @ManyToOne
    private User author;

    public Article() {
    }

    public Article(Shop shop, Place orderPlace, LocalDateTime deadline, List<Orders> orders, User author) {
        this.shop = shop;
        this.orderPlace = orderPlace;
        this.deadline = deadline;
        this.orders = orders;
        this.author = author;
    }
}
