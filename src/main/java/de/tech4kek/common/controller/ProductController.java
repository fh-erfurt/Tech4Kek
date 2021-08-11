package de.tech4kek.common.controller;

import de.tech4kek.computer.Computer;
import de.tech4kek.computer.ComputerFunctions;
import de.tech4kek.computer.Computerdetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import de.tech4kek.*;



@Controller
public class ProductController {

    @GetMapping
    public String getProducts(Model model){

        String testArray[] = new String[2];

        //Computerdetails name1 = new Computerdetails();
        //Computerdetails name2 = new Computerdetails();

        //name1.setDetailName("eins");
        //name2.setDetailName("zwei");
        testArray[0] = "name1";
        testArray[1] = "name2";
        model.addAttribute("testArray", testArray);
        Computer ComputerListe[] = ComputerFunctions.loadComputer();
        //model.addAttribute("ComputerListe", ComputerListe);

        return "products";
    }


}
