package com.eattogether.heytogether.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Place place;

    @Column(nullable = false)
    private List<Menu> menus;

    @Column
    private int minimumOrderPrice;

    @Column
    private Money deliveryTip;

    public Shop(Place place, List<Menu> menus, int minimumOrderPrice, Money deliveryTip) {
        this.place = place;
        this.menus = menus;
        this.minimumOrderPrice = minimumOrderPrice;
        this.deliveryTip = deliveryTip;
    }
}
