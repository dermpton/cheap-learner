package com.dermpton.elearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminPanelController {
    @GetMapping("/admin")
    public String getMethodName() {
        return "layouts/admin";
    }
    
}
