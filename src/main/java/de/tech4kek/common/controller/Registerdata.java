package de.tech4kek.common.controller;

import java.io.Serializable;

public class Registerdata implements Serializable {
    private String email;
    private String password;
    private String password2;
    private String firstname;
    private String lastname;
    private String country;
    private String city;
    private String number;
    private String street;
    private String houseNumber;

    public Registerdata(){
        this.password = password;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword2() {
        return password2;
    }

    public String getStreet() {
        return street;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
