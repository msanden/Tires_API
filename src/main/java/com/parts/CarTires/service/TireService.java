package com.parts.CarTires.service;

import com.parts.CarTires.dao.TireDao;
import com.parts.CarTires.entity.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TireService implements InterfaceTireService {

    private final TireDao tireDao;

    @Autowired
    public TireService(TireDao tireDao) {
        this.tireDao = tireDao;
    }

    @Override
    public List<Tire> findAll() {
        return tireDao.findAll();
    }

    @Override
    public Object findById(int id) {
        return tireDao.findById(id);
    }

    @Override
    public void saveOrUpdate(Tire tire) {
        tireDao.saveOrUpdate(tire);
    }

    @Override
    public void deleteById(int id) {
        tireDao.deleteById(id);
    }
}
