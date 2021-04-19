package com.itstep.car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunCar {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("spring-context.xml");
//
//        NissanCar nissanCar = context.getBean("nissanCar", NissanCar.class);
//        for (Driver driver : nissanCar.drivers) {
//            System.out.println(driver);
//        }
//
//        Driver driver = context.getBean("driver", Driver.class);
//        System.out.println(driver.getNissanCar());
//
//        Driver driver1 = context.getBean("driver", Driver.class);
//
//        driver1.setName("DriverJava");
//
//        System.out.println(driver.getName());
//        System.out.println(driver1.getName());

//        Driver driver2 = Driver.initDriver();
//        Driver driver3 = Driver.initDriver();

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(CarConfig.class);

        BuyCar buyCar = context.getBean(BuyCar.class);
        buyCar.showCar();


    }
}
