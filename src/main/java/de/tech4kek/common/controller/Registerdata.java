package de.tech4kek.common.controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.Serializable;

public class Registerdata implements Serializable {
    private String email;
    private String pw;
    private String pw2;
    private String firstname;
    private String lastname;
    private String country;
    private String city;
    private int number;
    private String street;
    private String houseNmbr;


    public Registerdata(){

    }

    public Registerdata(String pw, String email){
        this.pw = pw;
        this.email = email;
    }

    public int getNumber() {
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

    public String getHouseNmbr() {
        return houseNmbr;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPw2() {
        return pw2;
    }

    public String getStreet() {
        return street;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPw(String pw) {
        this.pw = pw;
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

    public void setHouseNmbr(String houseNmbr) {
        this.houseNmbr = houseNmbr;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPw2(String pw2) {
        this.pw2 = pw2;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
