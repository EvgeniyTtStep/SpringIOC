package com.itstep.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class CarConfig {
    @Bean
    public NissanCar nissanCar() {
        NissanCar nissanCar = new NissanCar();
        nissanCar.setName("JavaNissan");
        nissanCar.setDrivers(new HashSet<>(List.of(new Driver("Ivan", 33),
                new Driver("Petr", 31))));

        return nissanCar;
    }

    @Bean
    public ToyotaCar toyotaCar() {
        return new ToyotaCar();
    }

    @Bean
    public BuyCar buyCar(@Qualifier("nissanCar") Car car) {//@Autowired - внедряет зависимость

        //init ==== 1
        return new BuyCar(car);

//         init через constr ==== 2
//        return new BuyCar(toyotaCar);

        //init через setter ==== 3
//        BuyCar buyCar = new BuyCar(nissanCar);
//        buyCar.setCar(nissanCar);
//        return buyCar;

    }
}
