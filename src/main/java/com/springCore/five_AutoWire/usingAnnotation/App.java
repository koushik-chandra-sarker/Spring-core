package com.springCore.five_AutoWire.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");
        Employ employ = context.getBean("employ1", Employ.class);
        System.out.println(employ);
    }
}
