package com.emlakcepte.dao;

import com.emlakcepte.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //SELECT * FROM Users WHERE email = ?
    //@Query(value = "sql", nativeQuery = true) native sql scripti yazmamız gerekirse
    User findByMail(String email);
}
