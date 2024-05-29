package org.cydeo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(){
        return "home.html";
    }

}
