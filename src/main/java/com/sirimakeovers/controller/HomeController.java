package com.sirimakeovers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "index"; // templates/index.html (Thymeleaf)
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }
}
