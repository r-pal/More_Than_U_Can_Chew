package com.codeclan.example.More_Than_U_Can_Chew.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bakeryItems")
public class BakeryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="allergens")
    private String allergens;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="bakery_id")
//    @ManyToOne
//    @JoinColumn(name="bakery_id", nullable = false)
//    @JsonIgnoreProperties({"availableItems", "menuItems"})
    private Long bakeryId;

    @Column(name="image_id")
    private Long imageId;

//    @ManyToOne
    @Column(name = "order_id")
//    @JsonIgnoreProperties({"itemsOrdered"})
    private Long orderId;

    public BakeryItem(String name, String allergens, Long imageId, Long bakeryId, Integer quantity) {
        this.name = name;
        this.allergens = allergens;
        this.imageId = imageId;
        this.bakeryId = bakeryId;
        this.orderId = null;
        this.quantity = quantity;
    }

    public BakeryItem() {
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

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getBakeryId() {
        return bakeryId;
    }

    public void setBakeryId(Long bakeryId) {
        this.bakeryId = bakeryId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
