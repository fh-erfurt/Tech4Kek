package de.tech4kek.common.controller;

import de.tech4kek.common.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


//Controller for all things on the login Page

@Controller
public class LoginController{

    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("activePage", "login");
        return "login";
    }

    /**
     * Provides an instance of the model {@link Logindata}.
     * @return new instance of the model
     */

    @ModelAttribute("login")
    public Logindata getLoginModel(){
        Logindata res = new Logindata();
        return res;
    }


    @ModelAttribute("person")
    public Person getCurrentCart(){
        Person res = new Person();
        res.setFirstname("My first name");
        res.setLastname("My last name");

        return res;
    }



    @PostMapping("/loginform")
    public String loginforminputs(@ModelAttribute("login") Logindata login,  Model model) {
        String Email = login.getEmail();
        String Password = login.getPw();
        model.addAttribute("login", login);

        return "login";
    }




}
