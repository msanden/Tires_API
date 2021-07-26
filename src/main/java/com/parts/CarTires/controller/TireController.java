package com.parts.CarTires.controller;

import com.parts.CarTires.entity.Tire;
import com.parts.CarTires.service.InterfaceTireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class TireController {

    private final InterfaceTireService tireService;

    @Autowired
    public TireController(@Qualifier("tireService") InterfaceTireService tireService) {
        this.tireService = tireService;
    }

    //http://localhost:8080/retrieve_all_tires
    @GetMapping("/retrieve_all_tires")
    public List<Tire> findAll() {
        return tireService.findAll();
    }

    //http://localhost:8080/addTire
    @PostMapping("/addTire")
    public Tire addTire(@RequestBody Tire tire) {
        tire.setId(0);
        tireService.saveOrUpdate(tire);
        return tire;
    }

    //http://localhost:8080/updateTire
    @PutMapping("/updateTire")
    public Tire updateTire(@RequestBody Tire updateTire) {
        tireService.saveOrUpdate(updateTire);
        return updateTire;
    }

    ////http://localhost:8080/delete_tire_by_id/1
    @DeleteMapping("/delete_tire_by_id/{id}")
    public String deleteTire(@PathVariable int id) {
        tireService.deleteById(id);
        return "Deleted part id: " + id;
    }
}
