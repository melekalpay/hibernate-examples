package com.uniyaz.dao;

import com.uniyaz.HibernateUtils;
import com.uniyaz.domain.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonDaoTest {
    @Test
    public void findAllTest() {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.findAll();
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void insertTest() {
        Person person = new Person();
        person.setFirstName("Melek");
        person.setLastName("Alpay");
        person.setLastUpdate(new Date());
        BigDecimal bigDecimal = new BigDecimal(20000.23);
        person.setMontlySalary(bigDecimal);

        PersonDao personDao = new PersonDao();
        person = personDao.save(person);

        System.out.println(person);
    }

    @Test
    public void deleteTest() {

        Person person = new Person();
        person.setId(1L);

        PersonDao personDao = new PersonDao();
        personDao.delete(person);

        System.out.println("KAYIT SİLİNDİ");
    }

    @Test
    public void findAllByName() {
        String firstName = "Melek";
       PersonDao personDao = new PersonDao();
       List<Person> personList = personDao.findAllByName(firstName);
       for(Person person : personList){
           System.out.println(person);
       }


    }
}
