package com.poc.gitactions.githubactionspoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController {

    @GetMapping("/hello")
    public String hello(Model model) {
        return "Hello world";
    }
}
