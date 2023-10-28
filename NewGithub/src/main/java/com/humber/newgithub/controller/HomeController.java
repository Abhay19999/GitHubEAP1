package com.humber.newgithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String UpdateByAbhay(){
        return "Hello git from Abhay Github";
    }

}
