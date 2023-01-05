package com.uniyaz.dao;

import com.uniyaz.domain.Person;
import com.uniyaz.domain.Rehber;
import org.junit.Test;

import java.util.List;

public class RehberDaoTest {

    @Test
    public void findAllTest() {
        RehberDao rehberDao = new RehberDao();
        List<Rehber> rehberList = rehberDao.findAll();
        for (Rehber rehber : rehberList) {
            System.out.println(rehber);
        }
    }

    @Test
    public void insertTest() {
        Rehber rehber = new Rehber();
        rehber.setName("ATİLLA");
        rehber.setGsm("2312312");

        RehberDao rehberDao = new RehberDao();
        rehber = rehberDao.save(rehber);

        System.out.println(rehber);
    }

    @Test
    public void deleteTest() {

        Rehber rehber = new Rehber();
        rehber.setId(1L);

        RehberDao rehberDao = new RehberDao();
        rehberDao.delete(rehber);

        System.out.println("KAYIT SİLİNDİ");
    }

    @Test
    public void findAllByName() {
        String name = "ATİLLA";
        RehberDao rehberDao = new RehberDao();
        List<Rehber> rehberList = rehberDao.findAllByName(name);
        for(Rehber rehber : rehberList){
            System.out.println(rehber);
        }


    }
}
