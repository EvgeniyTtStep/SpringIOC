package com.itstep.developer;

public class DeveloperInit {
    static Developer developer;//been
    static DeveloperRun developerRun;//been

    public static Developer developerInit() {
       return developer = new PythonDeveloper();
    }

    public static DeveloperRun developerRunInit(){
        return developerRun = new DeveloperRunImpl(developer);
    }
}
