package org.cydeo.controller;

import org.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Spring Boot";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt();
        model.addAttribute("Id", studentId);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        model.addAttribute("numbers", numbers);

        LocalDate dt = LocalDate.now();
        model.addAttribute("date", dt);

        Student student = new Student(1, "Mike", "Sim");
        model.addAttribute("student", student);


        return "student/welcome";
    }

}
