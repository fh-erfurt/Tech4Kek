package de.tech4kek.common.controller;

import de.tech4kek.cart.Cart;
import de.tech4kek.cart.Cartfunctions;
import de.tech4kek.cart.Element;
import de.tech4kek.computer.Computer;
import de.tech4kek.computer.ComputerFunctions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class NavigationController {


    ComputerFunctions TheFunctions = new ComputerFunctions();
    Computer ComputerListe[] = TheFunctions.loadComputer();
    Cart shoppingCart = new Cart();
    Element element = new Element();
    Cartfunctions cartfunctions = new Cartfunctions();


    @GetMapping("/products")
    public String getProducts(Model model){

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

    @GetMapping("/shoppingCart")
    public String getShoppingCart(Model model){


        model.addAttribute("activePage", "shoppingCart");

        model.addAttribute("shoppingCart", shoppingCart);
        return "shoppingCart";
    }


    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public String getItem(Model model, @RequestParam("id") int id) {
        //System.out.println(id);
        Computer wantedComputer = null;

        for (Computer computer : ComputerListe) {
            if (computer.getItemId() == id) {
                wantedComputer = computer;
            }
        }
        model.addAttribute("computer", wantedComputer);

        return "item";
    }

    @ModelAttribute("itemData")
    public ItemData getItemModel(){
        ItemData itemData = new ItemData();
        return itemData;
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public ModelAndView addCart(@ModelAttribute("itemData") ItemData itemData) {
        int id = itemData.getId();

        Computer wantedComputer = null;

        for (Computer computer : ComputerListe) {
            if (computer.getItemId() == id) {
                wantedComputer = computer;
            }
        }
        System.out.println(id);


        element.setComputer(wantedComputer);
        shoppingCart.setFirstElement(element);

        System.out.println(element.getComputer().getItemId());

        return new ModelAndView("redirect:/item?id=" + id);
    }

}






