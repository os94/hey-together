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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Place getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(Place orderPlace) {
        this.orderPlace = orderPlace;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
