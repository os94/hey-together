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
}
