package com.springCore.two_constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personAPP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfig.xml");
        Person person = (Person) context.getBean("person");

        System.out.println(person);
    }
}
