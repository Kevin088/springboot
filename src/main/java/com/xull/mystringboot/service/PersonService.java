package com.xull.mystringboot.service;

import com.xull.mystringboot.dao.Person;

import java.util.List;


public interface PersonService {
    Person getPerson(int id);
    List<Person> getAllPerson();
}
