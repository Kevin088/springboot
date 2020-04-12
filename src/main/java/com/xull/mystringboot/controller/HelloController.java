package com.xull.mystringboot.controller;

import com.google.gson.Gson;
import com.xull.mystringboot.dao.Person;
import com.xull.mystringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/all")
    public String getAll(){
        List<Person> list=personService.getAllPerson();
        return new Gson().toJson(list);
    }
}
