package com.accutive.demo.database.nosql.controller;

import com.accutive.demo.database.nosql.model.User;
import com.accutive.demo.database.nosql.service.UserService;
import com.accutive.demo.database.nosql.validate.ValidateCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Save new user
    @PutMapping("/save")
    public User createUser(@RequestBody User user) throws Exception{
        return userService.saveUser(user);
    }

    // Get user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) throws Exception {
        return userService.getUserById(id);
    }

    // Busca usuário pelo username
    @PostMapping("/validate")
    public ResponseEntity<User> findByUsername(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {

        try {
        String[] credentials = authorizationHeader.split(":");
        String username = credentials[0];
        String password = credentials[1];
        User user = userService.getUserByUsername(username);
            boolean ok = ValidateCredentials.validateUser( user, username, password );
            if (ok) {
                return ResponseEntity.ok().build(); //.ok(user);
            } else {
                return ResponseEntity.notFound().build();
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}

