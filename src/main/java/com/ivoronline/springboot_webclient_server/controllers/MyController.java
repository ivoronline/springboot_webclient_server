package com.ivoronline.springboot_webclient_server.controllers;

import com.ivoronline.springboot_webclient_server.entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

  //===============================================================
  // GET TEXT
  //===============================================================
  @RequestMapping("GetText")
  String getText() {
    return "Hello from Controller";
  }

  //===============================================================
  // GET PERSON
  //===============================================================
  @RequestMapping("GetPerson")
  Person getPerson() {
    return new Person(1, "Jill", 3);
  }

  //===============================================================
  // GET PERSONS
  //===============================================================
  @RequestMapping("GetPersons")
  List<Person> getPersons() {

    //CREATE PERSONS
    Person person1 = new Person(2, "John", 40);
    Person person2 = new Person(3, "Bill", 50);

    //CREATE LIST
    List<Person> persons = new ArrayList();
                 persons.add(person1);
                 persons.add(person2);

    //RETURN PERSONS
    return persons;

  }

}


