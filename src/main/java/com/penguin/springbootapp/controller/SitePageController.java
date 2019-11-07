package com.penguin.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SitePageController {

    @GetMapping("/example.html")
    public String exmaple(){
        return "example";
    }

}
