package com.example.ssldemo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/welcome")
    String getWelcome() {

        return "ssl/welcome";
    }

}
