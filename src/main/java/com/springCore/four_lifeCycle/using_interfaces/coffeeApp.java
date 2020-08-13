package com.springCore.four_lifeCycle.using_interfaces;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class coffeeApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");

        Coffee coffee = (Coffee) context.getBean("coffee");
        System.out.println(coffee);
        context.registerShutdownHook();
    }

}
