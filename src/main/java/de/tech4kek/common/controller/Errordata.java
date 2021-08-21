package de.tech4kek.common.controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.Serializable;

public class Errordata implements Serializable {
    private String message;



    public Errordata(){

    }

    public Errordata(String message){
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
