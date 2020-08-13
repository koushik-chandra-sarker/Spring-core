package com.springCore.one_setterInjection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1.getName());
        System.out.println(employee1.getPhone());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getCourses());
        System.out.println(employee1.getProperties());
    }
}
