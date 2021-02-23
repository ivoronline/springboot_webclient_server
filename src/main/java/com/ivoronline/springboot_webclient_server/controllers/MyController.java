package com.ivoronline.springboot_webclient_server.controllers;

import com.ivoronline.springboot_webclient_server.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

  //===============================================================
  // GET PERSON
  //===============================================================
  @ResponseBody
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

  //===============================================================
  // GET PERSONS
  //===============================================================
  @ResponseBody
  @RequestMapping("/GetPersons")
  public List<Person> getPersons() {

    //CREATE PERSON 1
    Person person1      = new Person();
           person1.id   = 1;
           person1.name = "John";
           person1.age  = 20;

    //CREATE PERSON 2
    Person person2      = new Person();
           person2.id   = 2;
           person2.name = "Bill";
           person2.age  = 50;

    //CREATE LIST
    List<Person> persons = new ArrayList();
                 persons.add(person1);
                 persons.add(person2);

    //RETURN PERSON
    return persons;

  }

}


