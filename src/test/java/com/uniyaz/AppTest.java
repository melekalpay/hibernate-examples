package com.uniyaz;

import com.uniyaz.domain.Rehber;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void insertRehberTest() {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        Query query = currentSession.createQuery("Select rehber From Rehber rehber");
        List<Rehber> rehberList = query.list();
        currentSession.close();
        //currentSession.createCriteria();
        //currentSession.createSQLQuery("");
    }
}
