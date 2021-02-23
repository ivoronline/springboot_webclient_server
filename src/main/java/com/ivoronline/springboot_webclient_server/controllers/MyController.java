package com.ivoronline.springboot_webclient_server.controllers;

import com.ivoronline.springboot_webclient_server.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @RequestMapping("/GetPerson")
  public Person getPerson() {

    //CREATE PERSON
    Person person      = new Person();
           person.id   = 1;
           person.name = "John";
           person.age  = 20;

    //RETURN PERSON
    return person;

  }

}
