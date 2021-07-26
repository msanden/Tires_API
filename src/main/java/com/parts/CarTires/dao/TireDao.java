package com.parts.CarTires.dao;

import com.parts.CarTires.entity.Tire;

import java.util.List;

public interface TireDao {

    // select
    List<Tire> findAll();

    Tire findById(int id);

    // update
    void saveOrUpdate(Tire tire);

    // delete
    void deleteById(int id);

    /* //insert
    void add(Tire tire);*/
}
