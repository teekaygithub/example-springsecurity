package com.example.baeldung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomController {

    @GetMapping("/login")
    public String viewLoginPage(Model model) {

        return "login";
    }

    @GetMapping("/home")
    public String viewHomePage(Model model) {

        return "home";
    }
}