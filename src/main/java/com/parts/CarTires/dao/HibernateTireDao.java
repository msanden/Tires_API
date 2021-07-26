package com.parts.CarTires.dao;

import com.parts.CarTires.entity.Tire;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateTireDao implements TireDao {

    private final EntityManager entityManager;

    @Autowired
    public HibernateTireDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Tire> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Tire> query = session.createQuery("from Tire");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Tire findById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Tire.class, id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Tire tire) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(tire);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Tire tire = session.get(Tire.class, id);
        session.delete(tire);
    }

    /*@Override
    @Transactional
    public void add(Tire tire) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createSQLQuery("INSERT INTO car_parts (name) VALUES (:name)");
    }*/
}
