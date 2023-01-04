package com.uniyaz.service;

import com.uniyaz.domain.Rehber;
import org.junit.Test;

import java.util.List;

public class RehberServiceTest {

    @Test
    public void findAllTest() {
        RehberService rehberService = new RehberService();
        List<Rehber> rehberList = rehberService.findAll();
        for (Rehber rehber : rehberList) {
            System.out.println(rehber);
        }
    }

    @Test
    public void insertTest() {
        Rehber rehber = new Rehber();
        rehber.setId(1L);
        rehber.setName("ATİLLA");
        rehber.setGsm("2312312");

        RehberService rehberService = new RehberService();
        rehber = rehberService.save(rehber);

        System.out.println(rehber);
    }

    @Test
    public void deleteTest() {

        Rehber rehber = new Rehber();
        rehber.setId(1L);

        RehberService rehberService = new RehberService();
        rehberService.delete(rehber);

        System.out.println("KAYIT SİLİNDİ");
    }
}
