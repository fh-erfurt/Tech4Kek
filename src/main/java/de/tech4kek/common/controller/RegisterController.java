package de.tech4kek.common.controller;


import de.tech4kek.common.AccountFunctions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;


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
        Registerdata result = new Registerdata();
        return result;
    }


    @PostMapping("/registerform")
    public String registerforminputs(@ModelAttribute("register") Registerdata register,  Model model, HttpServletResponse response) {
        String email = register.getEmail();
        String password = register.getPassword();
        String password2 = register.getPassword2();
        String firstname =register.getFirstname();
        String lastname= register.getLastname();
        String country = register.getCountry();
        String city = register.getCity();
        String number = register.getNumber();
        String street = register.getStreet();
        String houseNumber=register.getHouseNumber();

        if (password==password2){
            AccountFunctions registerfunction = new AccountFunctions();

            if(registerfunction.Register(email, password, firstname, lastname, country, city, number, street,  houseNumber) != null){

                AccountFunctions Loginfunction = new AccountFunctions();
                Errordata errormsg = new Errordata();

                //If login data is correct, go to the index page
                if(Loginfunction.Login(email, password) != null){

                    Cookie cookieEmail = new Cookie("LoginEmail", email);
                    cookieEmail.setMaxAge(3600 * 24 * 30);
                    Cookie cookiePassword = new Cookie("LoginPW", password);
                    cookiePassword.setMaxAge(3600 * 24 * 30);

                    response.addCookie(cookieEmail);
                    response.addCookie(cookiePassword);


                    model.addAttribute("register", register);
                    System.out.println(email);
                    return "index";
                }
            }
        }

        return "register";
    }




}
