package com.penguin.springbootapp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.penguin.springbootapp.components.BooksComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class SiteApp implements CommandLineRunner {

    @Autowired
    BooksComponent bcomponent;

    public static void main(String[] args) {
        SpringApplication.run(SiteApp.class, args);
    }

    @Override
    public void run(String[] args) throws IOException {

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            //read json file and convert to books object
            List<Book> books = objectMapper.readValue(new File("src/main/resources/data.json"), new TypeReference<List<Book>>(){});
            bcomponent.setBooks(books);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
