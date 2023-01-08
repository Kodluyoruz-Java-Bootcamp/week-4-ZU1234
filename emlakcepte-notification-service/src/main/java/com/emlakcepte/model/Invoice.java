package com.emlakcepte.model;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "user_id")
    private int userId;  // kart sahibi
    @Column(name = "price")
    private int price;
    @Column(name = "product")
    //TODO product düzenle
    private String product;
    public Invoice(){
        super();
    }
    public Invoice(int id, int userId, int price, String product) {
        this.id = id;
        this.userId = userId;
        this.price = price;
        this.product = product;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
