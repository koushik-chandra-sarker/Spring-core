package com.springCore.one_setterInjection.referance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referanceConfig.xml");
        A a = (A) context.getBean("aRef");
        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
    }
}
