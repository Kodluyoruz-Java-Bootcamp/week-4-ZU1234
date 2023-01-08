package com.emlakcepte.model;

import com.emlakcepte.enums.ProductType;
import jakarta.persistence.*;

@Entity
@Table(name = "users_and_products")
public class RealtyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Enumerated(value = EnumType.ORDINAL)
    @Column(name = "productType")
    private ProductType productType;
    @Column(name = "packageEndDate")
    private String packageEndDate;

    public RealtyProduct() {
        super();
    }

    public RealtyProduct(Integer id, Integer userId, ProductType productType, String packageEndDate) {
        this.id = id;
        this.userId = userId;
        this.productType = productType;
        this.packageEndDate = packageEndDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getPackageEndDate() {
        return packageEndDate;
    }

    public void setPackageEndDate(String packageEndDate) {
        this.packageEndDate = packageEndDate;
    }
}
