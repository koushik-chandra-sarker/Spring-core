package com.springCore.five_AutoWire.usingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");
        Employ employ = context.getBean("employ",Employ.class);
        System.out.println(employ);
    }
}
