package com.codeclan.example.More_Than_U_Can_Chew.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name="bakeries")
public class Bakery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="email")
    private String email;

    @Column(name="collection_time")
    private LocalTime collectionTime;

    @OneToMany(mappedBy="bakery", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"bakery"})
    @Column(name="available_items")
    private List<BakeryItem> availableItems;

    @OneToMany(mappedBy="bakery", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"bakery"})
    @Column(name="menu_items")
    private List<BakeryItem> menuItems;

    @OneToMany(mappedBy ="bakery", fetch= FetchType.LAZY)
    @JsonIgnoreProperties({"bakery"})
    private List<Order> orders;

    public Bakery(String name, String location, String email, LocalTime collectionTime) {
        this.name = name;
        this.location = location;
        this.email = email;
        this.collectionTime = collectionTime;
        this.availableItems = new ArrayList<>();
        this.menuItems = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public Bakery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(LocalTime collectionTime) {
        this.collectionTime = collectionTime;
    }

    public List<BakeryItem> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<BakeryItem> availableItems) {
        this.availableItems = availableItems;
    }

    public void addABakeryItemToAvailability(BakeryItem bakeryItem){
        this.availableItems.add(bakeryItem);
    }

    public List<BakeryItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<BakeryItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
