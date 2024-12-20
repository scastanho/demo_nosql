package com.accutive.demo.database.nosql.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username); // Get user via {username}
    //User getUserById(String id); // Get user via {ID}
}
