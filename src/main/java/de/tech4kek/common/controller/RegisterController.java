package de.tech4kek.common.controller;


import de.tech4kek.common.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



//Controller for all things on the login Page

@Controller
public class RegisterController{
    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("activePage", "register");
        return "register";
    }

    /**
     * Provides an instance of the model {@link Registerdata}.
     * @return new instance of the model
     */

    @ModelAttribute("register")
    public Registerdata getRegisterModel(){
        Registerdata res = new Registerdata();
        return res;
    }


    @PostMapping("/registerform")
    public String registerforminputs(@ModelAttribute("register") Registerdata register,  Model model) {
        String Email = register.getEmail();
        String Password = register.getPw();
        model.addAttribute("register", register);

        return "register";
    }




}
