package org.cydeo.controller;

import org.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    //@RequestMapping(value = "/register", method = RequestMethod.GET) // localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("students", DataGenerator.createStudents());
        return "student/register";
    }

    //@RequestMapping(value = "/welcome", method = RequestMethod.POST) // localhost:8080/student/welcome?id=3
    @PostMapping("/welcome")
    public String welcome() {


        return "student/welcome";
    }

    @RequestMapping("/drop") // localhost:8080/student/drop
    public String drop() {


        return "student/register";
    }


}
