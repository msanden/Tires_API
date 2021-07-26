package com.parts.CarTires.service;

import com.parts.CarTires.entity.Tire;

import java.util.List;

public interface InterfaceTireService {
    List<Tire> findAll();
    Object findById(int id);
    void saveOrUpdate(Tire tire);
    void deleteById(int id);
}
