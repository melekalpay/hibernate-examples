package com.uniyaz.service;

import com.uniyaz.dao.PersonDao;
import com.uniyaz.dao.RehberDao;
import com.uniyaz.domain.Person;
import com.uniyaz.domain.Rehber;

import java.util.List;

public class PersonService {

    public List<Person> findAll() {
        PersonDao personDao = new PersonDao();
        return personDao.findAll();
    }

    public Person save(Person person) {
        PersonDao personDao = new PersonDao();
        return personDao.save(person);
    }

    public void delete(Person person) {
        PersonDao personDao = new PersonDao();
        personDao.delete(person);
    }
}
