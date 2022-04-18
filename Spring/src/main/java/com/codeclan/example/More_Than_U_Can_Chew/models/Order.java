package com.codeclan.example.More_Than_U_Can_Chew.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

//    @Column(name="items_ordered")

//    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties({"order", "bakery"})
//    @JsonIgnoreProperties({"bakery"})
//    private List<Long> itemsOrdered;

    @Column(name="bakery_id")
//    @ManyToOne
//    @JoinColumn(name="bakery_id", nullable = false)
//    @JsonIgnoreProperties({"orders", "menuItems", "availableItems"})
    private Long bakeryId;

    @Column(name="user_id")
//    @ManyToOne
//    @JoinColumn(name="user_id", nullable = false)
//    @JsonIgnoreProperties({"orders"})
    private Long userId;

    @Column(name="collected_status")
    private boolean collectedStatus;

    public Order(Long bakeryId, Long userId, boolean collectedStatus) {
        this.bakeryId = bakeryId;
        this.userId = userId;
        this.collectedStatus = collectedStatus;
//        this.itemsOrdered = new ArrayList<>();
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Long> getItemsOrdered() {
//        return itemsOrdered;
//    }
//
//    public void setItemsOrdered(List<Long> itemsOrdered) {
//        this.itemsOrdered = itemsOrdered;
//    }
//
//    public void addABakeryItemToOrder(Long bakeryItem){
//        this.itemsOrdered.add(bakeryItem);
//    }

//    public Bakery getBakery() {
//        return bakery;
//    }
//
//    public void setBakery(Bakery bakery) {
//        this.bakery = bakery;
//    }


    public Long getBakeryId() {
        return bakeryId;
    }

    public void setBakeryId(Long bakeryId) {
        this.bakeryId = bakeryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isCollectedStatus() {
        return collectedStatus;
    }

    public void setCollectedStatus(boolean collectedStatus) {
        this.collectedStatus = collectedStatus;
    }


}
