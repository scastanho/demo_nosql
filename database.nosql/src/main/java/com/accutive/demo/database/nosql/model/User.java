package com.accutive.demo.database.nosql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String username; // Campo correto
    private String pass;
    private String company;
    private String country;
    private String address;
    private String state;
    private String zip;

    // Construtor padrão
    public User() {}

    // Construtor parametrizado
    public User(String id, String name, String email, String username, String pass,
                String company, String country, String address, String state, String zip) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.pass = pass;
        this.company = company;
        this.country = country;
        this.address = address;
        this.state = state;
        this.zip = zip;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", company='" + company + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

}
