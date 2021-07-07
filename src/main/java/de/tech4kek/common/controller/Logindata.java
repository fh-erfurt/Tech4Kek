package de.tech4kek.common.controller;
import java.io.Serializable;

public class Logindata implements Serializable {
    private String email;
    private String pw;


    public Logindata(){

    }

    public Logindata(String pw, String email){
        this.pw = pw;
        this.email = email;
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
}
