package com.demo.sept29.demosept29.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sept29.demosept29.model.Person;

@RestController
public class PersonController {
	
	@RequestMapping("/create-a-person")
    public Person person(@RequestParam(value="name", defaultValue="Sagar") String name) {
        return new Person(name, null, "alice@gmail.com", com.demo.sept29.demosept29.model.Gender.FEMALE, 26);
    }

}
