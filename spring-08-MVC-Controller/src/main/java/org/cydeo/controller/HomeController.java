package org.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home (){
        return "home.html";
    }

    @RequestMapping("/oddo")
    public String home1 (){
        return "home.html";
    }

    @RequestMapping // nothing and /
    public String homeDefault (){
        return "home.html";
    }

    @RequestMapping({"/home2","/apple","orange" })
    public String home2 (){
        return "home2.html";
    }

}
