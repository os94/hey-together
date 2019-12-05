package com.eattogether.heytogether.service.dto;

import com.eattogether.heytogether.domain.Orders;
import com.eattogether.heytogether.domain.Place;
import com.eattogether.heytogether.domain.Shop;

import java.time.LocalDateTime;

public class ArticleRequest {
    private Place place;
    private Shop shop;
    private Orders orders;
    private LocalDateTime deadline;
    // author id 필드 추가예정

    public ArticleRequest() {
    }

    public ArticleRequest(Place place, Shop shop, Orders orders, LocalDateTime deadline) {
        this.place = place;
        this.shop = shop;
        this.orders = orders;
        this.deadline = deadline;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
