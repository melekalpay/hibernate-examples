package com.uniyaz.service;

import com.uniyaz.dao.RehberDao;
import com.uniyaz.domain.Rehber;

import java.util.List;

public class RehberService {

    public List<Rehber> findAll() {
        RehberDao rehberDao = new RehberDao();
        return rehberDao.findAll();
    }

    public Rehber save(Rehber rehber) {
        RehberDao rehberDao = new RehberDao();
        return rehberDao.save(rehber);
    }

    public void delete(Rehber rehber) {
        RehberDao rehberDao = new RehberDao();
        rehberDao.delete(rehber);
    }
}
