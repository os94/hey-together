package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @OneToOne
    private Orders orders;

    // User author 필드 추가 예정

    public Article() {
    }

    public Article(Shop shop, Place orderPlace, LocalDateTime deadline, Orders orders) {
        this.shop = shop;
        this.orderPlace = orderPlace;
        this.deadline = deadline;
        this.orders = orders;
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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
