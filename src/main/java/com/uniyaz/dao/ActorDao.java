package com.uniyaz.dao;

import com.uniyaz.HibernateUtil;
import com.uniyaz.HibernateUtils;
import com.uniyaz.domain.Actor;
import com.uniyaz.domain.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ActorDao {
    public List<Actor> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("Select actor From Actor actor");
        List<Actor> actorList = query.list();
        return actorList;
    }

    public Actor save(Actor actor) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        actor= (Actor) currentSession.merge(actor);
        transaction.commit();
        return actor;
    }

    public void delete(Actor actor) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.delete(actor);
        transaction.commit();
    }

    public List<Actor> findAllByName(String firstName) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("Select actor From Actor actor where actor.first_name = :isim ");
        query.setParameter("isim", firstName);
        List<Actor> actorList = query.list();
        return actorList;
    }
}
