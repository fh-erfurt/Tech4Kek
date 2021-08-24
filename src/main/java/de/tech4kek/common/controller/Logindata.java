package de.tech4kek.common.controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.Serializable;

public class Logindata implements Serializable {
    private String email;
    private String pw;


    public Logindata(){
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
