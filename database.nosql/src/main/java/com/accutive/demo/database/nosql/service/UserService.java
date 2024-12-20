package com.accutive.demo.database.nosql.service;

import com.accutive.demo.database.nosql.exception.ErrorMessages;
import com.accutive.demo.database.nosql.model.User;
import com.accutive.demo.database.nosql.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        logger.info("Usuários encontrados: {}", users.size());
        return users;
    }

    // Save new user on DB
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get user via {ID}
    public User getUserById(String id) {
        String language  = System.getProperty("language");

        if (userRepository == null) {
            String error_msg =  ErrorMessages.getMessage("REPOSITORY_NOT_INJECTED", language);
            logger.error(error_msg);
            throw new RuntimeException(error_msg);
        }

        logger.info("Localize ID="+id);
        // Execute findById
        return userRepository.findById(id)
                .orElseThrow(() -> {
                    String error_msg =  ErrorMessages.getMessage("USER_NOT_FOUND", language)+" | ID="+id;
                    logger.error(error_msg, id );
                    return new RuntimeException(ErrorMessages.getMessage("USER_NOT_FOUND", language) + id);
                });
    }

    // Get user via {username}
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}