package com.uniyaz.service;

import com.uniyaz.dao.PersonService;
import com.uniyaz.domain.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PersonServiceTest {
    @Test
    public void findAllTest() {
        PersonService personService = new PersonService();
        List<Person> personList = personService.findAll();
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

        PersonService personService = new PersonService();
        person = personService.save(person);

        System.out.println(person);
    }

    @Test
    public void deleteTest() {

        Person person = new Person();
        person.setId(1L);

        PersonService personService = new PersonService();
        personService.delete(person);

        System.out.println("KAYIT SİLİNDİ");
    }
}
