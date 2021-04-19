package com.itstep.car;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class NissanCar implements Car{

    String name;

    List<Model> models;

    Set<Driver>drivers;

    Map<String,Integer>map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String getCar() {
        return "Nissan";
    }

    @Override
    public String engine() {
        return "Nissan engine";
    }

    @Override
    public String toString() {
        return "NissanCar{" +
                "name='" + name + '\'' +
                ", models=" + models +
                ", drivers=" + drivers +
                ", map=" + map +
                '}';
    }
}
