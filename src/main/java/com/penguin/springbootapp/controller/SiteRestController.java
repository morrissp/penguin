package com.penguin.springbootapp.controller;

import com.penguin.springbootapp.components.BooksComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SiteRestController {

    @Autowired
    BooksComponent bcomponent;

    @RequestMapping("/data.json")
    public List exmaple(){
        return bcomponent.getValidBooks();
    }
    
}
