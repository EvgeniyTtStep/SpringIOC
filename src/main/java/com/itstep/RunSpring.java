package com.itstep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
       ApplicationContext context =
               new ClassPathXmlApplicationContext("app.xml");

        DeveloperRun developerRun = context.getBean("developer", DeveloperRun.class);
        developerRun.runCode();

    }
}
