package com.uniyaz.dao;

import com.uniyaz.domain.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PersonDaoTest {
    @Test
    public void findAllTest() {
        PersonService personDao = new PersonService();
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

        PersonService personDao = new PersonService();
        person = personDao.save(person);

        System.out.println(person);
    }

    @Test
    public void deleteTest() {

        Person person = new Person();
        person.setId(1L);

        PersonService personDao = new PersonService();
        personDao.delete(person);

        System.out.println("KAYIT SİLİNDİ");
    }
}
