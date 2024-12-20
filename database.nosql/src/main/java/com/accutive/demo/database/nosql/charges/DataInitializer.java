package com.accutive.demo.database.nosql.charges;

import com.accutive.demo.database.nosql.model.User;
import com.accutive.demo.database.nosql.model.UserRepository;
import com.accutive.demo.database.nosql.setup.InitialSetup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(UserRepository userRepository) {
        return args -> {
            // Create user list
            List<User> users = new ArrayList<>();

            // PRepare X users to save
            Random random = new Random();
            for (int i = 1; i <= 100000; i++) {
                String id = String.valueOf(i);
                //String name = "User." + random.nextInt(1000);
                String name = "User_" + i;
                String email = (name).toLowerCase() + "@accutive.com"; // E-mail aleatório
                String username = email.split("@")[0];
                String pass = + i + "&$"+random.nextInt(100000)+"!#";
                User user = new User(i+"" , name, email, username, pass, "n/a","n/a","n/a","n/a","n/a");
                users.add(user);
            }

            // Save all users on MongoDB ,  run only first time.
            if (InitialSetup.INITIALLOAD != null)
                userRepository.saveAll(users);
        };
    }
}
