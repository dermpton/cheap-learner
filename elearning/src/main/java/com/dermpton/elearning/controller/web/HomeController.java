package com.dermpton.elearning.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
//    File path will resolve index.html
//	  resources.templates.*
}
