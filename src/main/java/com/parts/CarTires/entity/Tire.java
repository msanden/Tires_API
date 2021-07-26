package com.parts.CarTires.entity;


import javax.persistence.*;

@Entity
@Table(name = "car_tires")
public class Tire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    protected Tire(){ }

    public Tire(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return String.format("Tire[id=%d, name='%s', description='%s']", id, name, description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
