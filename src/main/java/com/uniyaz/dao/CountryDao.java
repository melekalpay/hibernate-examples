package com.uniyaz.dao;

import com.uniyaz.HibernateUtil;
import com.uniyaz.domain.Actor;
import com.uniyaz.domain.Country;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CountryDao {
    public List<Country> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("Select c From Country c");
        List<Country> countries = query.list();
        return countries;
    }

    public Country save(Country country) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        country= (Country) currentSession.merge(country);
        transaction.commit();
        return country;
    }
}
