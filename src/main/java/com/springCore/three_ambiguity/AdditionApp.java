package com.springCore.three_ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambiguityConfig.xml");
        Addition addition = (Addition) context.getBean("addition");
        addition.sum();
    }
}
