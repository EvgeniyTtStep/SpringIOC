package com.itstep.developer;

public class DeveloperRunImpl implements DeveloperRun {

    //Dependency injection
    private final Developer developer;

    public DeveloperRunImpl(Developer developer) {
        this.developer = developer;
    }


    @Override
    public void runCode() {
        System.out.println(developer.writeCode());
    }
}
