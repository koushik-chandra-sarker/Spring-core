package com.springCore.eight_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
        Student student = context.getBean("getStudent",Student.class);
        System.out.println(student);
    }
}
