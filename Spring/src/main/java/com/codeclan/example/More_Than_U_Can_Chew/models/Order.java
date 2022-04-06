package com.codeclan.example.More_Than_U_Can_Chew.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    @JsonBackReference
    List<BakeryItem> itemsOrdered;

    @ManyToOne
    @JoinColumn(name="bakery_id", nullable = false)
    private Bakery bakery;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Column(name="collected_status")
    private boolean collectedStatus;

    public Order(Bakery bakery, User user, boolean collectedStatus) {
        this.bakery = bakery;
        this.user = user;
        this.collectedStatus = collectedStatus;
        this.itemsOrdered = new ArrayList<>();
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BakeryItem> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(List<BakeryItem> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public void addABakeryItemToOrder(BakeryItem bakeryItem){
        this.itemsOrdered.add(bakeryItem);
    }

    public Bakery getBakery() {
        return bakery;
    }

    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isCollectedStatus() {
        return collectedStatus;
    }

    public void setCollectedStatus(boolean collectedStatus) {
        this.collectedStatus = collectedStatus;
    }
}
