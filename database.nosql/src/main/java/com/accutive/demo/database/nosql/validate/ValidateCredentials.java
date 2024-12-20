package com.accutive.demo.database.nosql.validate;

import com.accutive.demo.database.nosql.model.User;
import com.accutive.demo.database.nosql.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateCredentials {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    // Compare {user} and {pass}
    public static boolean validateUser(User user, String username, String password)  throws Exception{

        logger.info("**** >>>> ValidateCredentials.User: "+ user);
        if (user != null){
            logger.info("**** >>>> \nValidateCredentials.User: \n"+ user.toString());
            logger.info("ValidateCredentials.username: "+ username);
            logger.info("ValidateCredentials.password: "+ password);
            if (user != null && user.getPass().equals(password)) {
                logger.info("Valid credentials!");
                return true; // User and pass okay
            }{
                logger.info("Invalid credentials!");
                return false; // Invalid credentials
            }
        }else{
            logger.info("User invalid or lost parameters!");
            throw new Exception("Invalid user or lost request parameters!");
        }

    }

}
