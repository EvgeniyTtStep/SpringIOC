package com.itstep.developer;

import java.util.List;

public class JavaDeveloper implements Developer {

    String name;
    String age;
    long salary;

    List<PythonDeveloper> pythonDevelopers;

    public List<PythonDeveloper> getPythonDevelopers() {
        return pythonDevelopers;
    }

    public void setPythonDevelopers(List<PythonDeveloper> pythonDevelopers) {
        this.pythonDevelopers = pythonDevelopers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String writeCode() {

        return this.name + " Write Java Code , age= " + this.age + ", salary= " + this.salary ;
    }
}
