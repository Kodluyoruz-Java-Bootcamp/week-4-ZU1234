package com.emlakcepte.dao;

import com.emlakcepte.model.RealtyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersAndProductsRepository extends JpaRepository<RealtyProduct,Integer> {
    List<RealtyProduct> findAllByUserId(Integer userId);
}
