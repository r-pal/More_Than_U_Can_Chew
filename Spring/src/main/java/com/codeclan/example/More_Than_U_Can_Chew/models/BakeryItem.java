package com.codeclan.example.More_Than_U_Can_Chew.models;


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

    @Column(name="ingredients")
    private String ingredients;

    @Column(name="allergens")
    private String allergens;

//    @ManyToOne
//    @JoinColumn(name="bakery_id", nullable = false)
//    private Bakery bakery;

    @Column(name="imageUrl")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name="bakery_id", nullable = false)
    private Bakery bakery;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    public BakeryItem(String name, String ingredients, String allergens, String imageUrl, Bakery bakery) {
        this.name = name;
        this.ingredients = ingredients;
        this.allergens = allergens;
        this.imageUrl = imageUrl;
        this.bakery = bakery;
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Bakery getBakery() {
        return bakery;
    }

    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
