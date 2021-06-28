package de.tech4kek.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("activePage", "login");
        return "login";
    }

    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("activePage", "register");
        return "register";
    }

}
