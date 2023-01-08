package com.emlakcepte.model;


import com.emlakcepte.enums.ProductType;

public class Invoice {
    private Integer userId;
    private Integer price;
    private ProductType productType;

    public Invoice() {
        super();
    }

    public Invoice(Integer userId, Integer price,ProductType productType) {
        this.userId = userId;
        this.price = price;
        this.productType = productType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
