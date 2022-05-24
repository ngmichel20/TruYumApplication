package com.cogniznant.truyum.microservice.menuitem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;

//    @Column(name = "me_active")
//    boolean active;

//    @Column(name = "me_date_of_launch")
//    Date dateOfLaunch;

    private String category;
    private boolean freeDelivery;

    public MenuItem(int id, String name, double price, String category, boolean freeDelivery) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.freeDelivery = freeDelivery;
    }

    //    @Column(name = "me_url")
//    String url;
}
