package com.emlakcepte.controller;

import com.emlakcepte.converter.UserConverter;
import com.emlakcepte.model.Invoice;
import com.emlakcepte.request.PaymentRequest;
import com.emlakcepte.request.UserRequest;
import com.emlakcepte.response.PaymentResponse;
import com.emlakcepte.response.UserResponse;
import com.emlakcepte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired //injection işlemi : spring tarafından oluşan objenin bağlanması. Default tanımı singleton.
    private UserService userService;
    @Autowired
    private UserConverter converter;



    @GetMapping
    public ResponseEntity<List<UserResponse>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest) {
        //Loggera bulunduğu sınıfın isminden gidilmeye çalışılmış
        Logger logger = Logger.getLogger(UserController.class.getName());
        UserResponse userResponse = userService.createUser(userRequest);

        logger.log(Level.INFO, "user created : {0}", userResponse);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping(value = "/{email}")
    public ResponseEntity<UserResponse> getByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.getByEmail(email));
    }
    @PostMapping(value = "/payment")
    public ResponseEntity<PaymentResponse> payment(@RequestBody PaymentRequest paymentRequest){
        userService.payment(paymentRequest);
        return ResponseEntity.ok(converter.convert(paymentRequest));
    }






}
