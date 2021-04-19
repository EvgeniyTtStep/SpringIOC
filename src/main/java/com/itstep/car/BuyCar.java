package com.itstep.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyCar {

    //Внедрение обьекта в класс BuyCar
    private  Car car;


    public BuyCar() {
    }


    public BuyCar(Car car) {
        this.car = car;
    }


//    @Autowired //указывает что внедрение обьекта происходит через сеттер
//    public void setCar(Car car) {
//        this.car = car;
//    }

    public Car getCar() {
        return car;
    }

    public void showCar(){
        System.out.println("This is my car " + car.getCar() +"\n"
        + " Engine = " + car.engine());
    }
}
