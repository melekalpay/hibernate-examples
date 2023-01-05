package com.uniyaz.dao;

import com.uniyaz.domain.Actor;
import com.uniyaz.domain.Country;
import org.junit.Test;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

public class CountryDaoTest {

    @Test
    public void findAllTest() {
        CountryDao countryDao = new CountryDao();
        List<Country> countries = countryDao.findAll();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    @Test
    public void insertTest() {
       Country country = new Country();
        country.setCountry("Türkiye");
        country.setLast_update(new Date());

        CountryDao countryDao = new CountryDao();
        country = countryDao.save(country);

        System.out.println(country);
    }
}
