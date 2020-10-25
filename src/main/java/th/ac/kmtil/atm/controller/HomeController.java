package th.ac.kmtil.atm.controller;
//Chutima Wongsasao 61050825

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public  String getHomePage(Model model){
        model.addAttribute("greeting","Sawaddee");
        return  "home";     // home template (home.html)
    }

}
