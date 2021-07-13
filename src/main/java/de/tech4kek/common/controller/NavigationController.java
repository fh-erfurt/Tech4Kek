package de.tech4kek.common.controller;

import de.tech4kek.cart.Cart;
import de.tech4kek.cart.Element;
import de.tech4kek.common.AccountFunctions;
import de.tech4kek.common.Person;
import de.tech4kek.computer.Computer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavigationController {

    @GetMapping("/info")
    public String getInfo(Model model){
        model.addAttribute("activePage", "info");
        return "info";
    }

    @GetMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("activePage", "contact");
        return "contact";
    }

    @GetMapping("/agb")
    public String getAGB(Model model){
        model.addAttribute("activePage", "agb");
        return "agb";
    }

    @ModelAttribute("person")
    public Person getCurrentCart(){
        Person res = new Person();
        res.setM_Firstname("My first name");
        res.setM_Lastname("My last name");

        return res;
    }


    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("activePage", "register");
        return "register";
    }

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

    @PostMapping("/loginform")
    public String loginforminputs(@ModelAttribute("login") Logindata login,  Model model) {
        String Email = login.getEmail();
        String Password = login.getPw();
        model.addAttribute("login", login);

        return "login";
    }
}
