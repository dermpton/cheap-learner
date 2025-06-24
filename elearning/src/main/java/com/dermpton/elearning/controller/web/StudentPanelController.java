package com.dermpton.elearning.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentPanelController {
    @GetMapping("/student")
    public String dashboard() {
        return "layouts/student-dash";
    }

    @GetMapping("/student/calendar")
    public String calendar() {
        return "calendar";
    }
    
    
}
