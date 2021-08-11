package de.tech4kek.common.controller;

import de.tech4kek.cart.Cart;
import de.tech4kek.cart.Element;
import de.tech4kek.common.AccountFunctions;
import de.tech4kek.common.Person;
import de.tech4kek.common.Tech4kek;
import de.tech4kek.computer.Computer;
import de.tech4kek.computer.ComputerFunctions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NavigationController {

    @GetMapping("/products")
    public String getProducts(Model model){

        ComputerFunctions TheFunctions = new ComputerFunctions();
        Computer ComputerListe[] = TheFunctions.loadComputer();

        model.addAttribute("ComputerListe", ComputerListe);
        model.addAttribute("activePage", "products");
        return "products";
    }

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

    @GetMapping("/item")
    public String getItem(Model model){
        model.addAttribute("activePage", "item");
        return "item";
    }



}
