package com.springCore.seven_StereotypeAnnotation.Collection_With_Value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoAnnotationConfig.xml");
        Teacher teacher = context.getBean("teach", Teacher.class);
        System.out.println(teacher);
    }
}
