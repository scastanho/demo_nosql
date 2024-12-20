package com.accutive.demo.database.nosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("language","en");
		//System.setProperty("INITIALLOAD","OK");
		SpringApplication.run(Application.class, args);
	}
}
