package com.eattogether.heytogether;

import com.eattogether.heytogether.domain.Money;
import com.eattogether.heytogether.domain.Orders;
import com.eattogether.heytogether.domain.Place;
import com.eattogether.heytogether.domain.Shop;

import java.time.LocalDateTime;

public class ArticleDto {
    private Place place;
    private Shop shop;
    private Money minimumOrderPrice;
    private Money deliveryTip;
    private Orders orders;
    private LocalDateTime deadline;

    public ArticleDto() {
    }

    public ArticleDto(Place place, Shop shop, Money minimumOrderPrice, Money deliveryTip, Orders orders, LocalDateTime deadline) {
        this.place = place;
        this.shop = shop;
        this.minimumOrderPrice = minimumOrderPrice;
        this.deliveryTip = deliveryTip;
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

    public Money getMinimumOrderPrice() {
        return minimumOrderPrice;
    }

    public void setMinimumOrderPrice(Money minimumOrderPrice) {
        this.minimumOrderPrice = minimumOrderPrice;
    }

    public Money getDeliveryTip() {
        return deliveryTip;
    }

    public void setDeliveryTip(Money deliveryTip) {
        this.deliveryTip = deliveryTip;
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
