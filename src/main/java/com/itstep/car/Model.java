package com.itstep.car;

public class Model {
    String name;
    Long serialNumber;

    public Model() {
    }

    public Model(String name, Long serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
