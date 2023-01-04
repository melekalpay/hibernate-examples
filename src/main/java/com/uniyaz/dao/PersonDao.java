package com.uniyaz.dao;

import com.uniyaz.HibernateUtils;
import com.uniyaz.domain.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDao {
    public List<Person> findAll() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("Select person From Person person");
        List<Person> personList = query.list();
        return personList;
    }

    public Person save(Person person) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        person = (Person) currentSession.merge(person);
        transaction.commit();
        return person;
    }

    public void delete(Person person) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.delete(person);
        transaction.commit();
    }
}
