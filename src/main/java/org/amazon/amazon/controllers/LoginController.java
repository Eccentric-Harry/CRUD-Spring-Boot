package org.amazon.amazon.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Login Successful";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "Logout Successful";
    }
}
