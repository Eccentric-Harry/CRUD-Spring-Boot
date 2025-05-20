package org.amazon.amazon.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "This is Home Page";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is About Page";
    }
}
