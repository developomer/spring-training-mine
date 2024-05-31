package org.cydeo.controller;

import org.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register") // localhost:8080/student/register
    public String register(Model model) {
        model.addAttribute("students", DataGenerator.createStudents());
        return "student/register";
    }


    @RequestMapping("/drop") // localhost:8080/student/drop
    public String drop() {


        return "student/register";
    }

     @RequestMapping("/welcome") // localhost:8080/student/welcome?id=3
    public String welcome( Model model, @RequestParam String name) {

         System.out.println(name);

        return "student/welcome";
    }

}
