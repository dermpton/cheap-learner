package com.dermpton.elearning.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentLoginController {
    @GetMapping("/student/student-login")
    public String studentLogin(){
        return "student/student-login";
    }
}
