package com.xull.mystringboot.service;

import com.xull.mystringboot.dao.Person;
import com.xull.mystringboot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person getPerson(int id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person>  getAllPerson() {
        return personMapper.selectAll();
    }


}
