package com.itstep.car;

import org.springframework.stereotype.Component;


@Component
public class ToyotaCar implements Car {
    @Override
    public String getCar() {
        return "Toyota";
    }

    @Override
    public String engine() {
        return "Toyota engine";
    }
}
