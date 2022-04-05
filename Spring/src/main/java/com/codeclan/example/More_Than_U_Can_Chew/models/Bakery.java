package com.codeclan.example.More_Than_U_Can_Chew.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name="collectionTime")
    private DateTimeFormat collectionTime;

    @OneToMany(mappedBy="availableItems", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<BakeryItem> availableItems;

    @OneToMany(mappedBy="currentOrders", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Order> currentOrders;

    public Bakery(String name, String location, String email, DateTimeFormat collectionTime) {
        this.name = name;
        this.location = location;
        this.email = email;
        this.collectionTime = collectionTime;
        this.availableItems = new ArrayList<>();
        this.currentOrders = new ArrayList<>();
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

    public DateTimeFormat getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(DateTimeFormat collectionTime) {
        this.collectionTime = collectionTime;
    }

    public List<BakeryItem> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<BakeryItem> availableItems) {
        this.availableItems = availableItems;
    }

    public List<Order> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(List<Order> currentOrders) {
        this.currentOrders = currentOrders;
    }
}
