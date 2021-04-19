package com.itstep.car;

public class Driver {
    //public static Driver driver;
    String name;
    int age;

    private NissanCar nissanCar;

    public NissanCar getNissanCar() {
        return nissanCar;
    }

    public void setNissanCar(NissanCar nissanCar) {
        this.nissanCar = nissanCar;
    }

//    public static Driver initDriver(){
//        if(driver == null){
//         return new Driver();
//        }
//        return driver;
//    }

    public Driver() {
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
