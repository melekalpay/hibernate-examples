package com.uniyaz.dao;

import com.uniyaz.domain.Actor;
import com.uniyaz.domain.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ActorDaoTest {
    @Test
    public void findAllTest() {
        ActorDao actorDao = new ActorDao();
        List<Actor> actorList = actorDao.findAll();
        for (Actor actor : actorList) {
            System.out.println(actor);
        }
    }

    @Test
    public void insertTest() {
        Actor actor = new Actor();
        actor.setFirst_name("Melek");
        actor.setLast_name("Alpay");
        actor.setLast_update(new Date());

        ActorDao actorDao = new ActorDao();
        actor = actorDao.save(actor);

        System.out.println(actor);
    }

    @Test
    public void deleteTest() {
        Actor actor = new Actor();
        actor.setActor_id(1L);

        ActorDao actorDao = new ActorDao();
        actorDao.delete(actor);

        System.out.println("KAYIT SİLİNDİ");
    }

    @Test
    public void findAllByName() {
        String firstName = "Melek";
        ActorDao actorDao = new ActorDao();
        List<Actor> actorList = actorDao.findAllByName(firstName);
        for(Actor actor : actorList){
            System.out.println(actor);
        }

    }
}
