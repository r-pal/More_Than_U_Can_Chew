package com.codeclan.example.More_Than_U_Can_Chew.models;


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

    @Column(name="imageUrl")
    private String imageUrl;

    public BakeryItem(String name, String ingredients, String allergens, String imageUrl) {
        this.name = name;
        this.ingredients = ingredients;
        this.allergens = allergens;
        this.imageUrl = imageUrl;
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
}
