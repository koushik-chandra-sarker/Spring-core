package com.springCore.seven_StereotypeAnnotation.Component_Value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoAnnotationConfig.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
    }
}
