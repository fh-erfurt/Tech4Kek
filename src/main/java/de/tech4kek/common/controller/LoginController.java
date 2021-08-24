package de.tech4kek.common.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import de.tech4kek.common.AccountFunctions;
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

    @ModelAttribute("error")
    public Errordata getErrorModel(){
        Errordata res = new Errordata();
        return res;
    }

    @PostMapping("/loginform")
    public String loginforminputs(@ModelAttribute("login") Logindata login,  Model model, HttpServletResponse response) {
        String Email = login.getEmail();
        String Password = login.getPw();


        AccountFunctions Loginfunction = new AccountFunctions();
       Errordata errormsg = new Errordata();

       //If login data is correct, go to the index page
        if(Loginfunction.Login(Email, Password) != null){

            Cookie cookieEmail = new Cookie("LoginEmail", Email);
            cookieEmail.setMaxAge(3600 * 24 * 30);
            Cookie cookiePassword = new Cookie("LoginPW", Password);
            cookiePassword.setMaxAge(3600 * 24 * 30);

            response.addCookie(cookieEmail);
            response.addCookie(cookiePassword);
            return"index";
        }

        model.addAttribute("login", login);
        //If login data is wrong, reload login page
        return "login";
    }



}
