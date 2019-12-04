package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Place place;

    @OneToMany
    private List<Menu> menus;

    @Column
    private int minimumOrderPrice;

    @OneToOne
    private Money deliveryTip;

    public Shop() {
    }

    public Shop(Place place, List<Menu> menus, int minimumOrderPrice, Money deliveryTip) {
        this.place = place;
        this.menus = menus;
        this.minimumOrderPrice = minimumOrderPrice;
        this.deliveryTip = deliveryTip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public int getMinimumOrderPrice() {
        return minimumOrderPrice;
    }

    public void setMinimumOrderPrice(int minimumOrderPrice) {
        this.minimumOrderPrice = minimumOrderPrice;
    }

    public Money getDeliveryTip() {
        return deliveryTip;
    }

    public void setDeliveryTip(Money deliveryTip) {
        this.deliveryTip = deliveryTip;
    }
}
