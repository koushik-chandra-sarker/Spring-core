package com.springCore.four_lifeCycle.using_bean_initialize;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifeCycleApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");

        T_Shirt t_shirt = (T_Shirt) context.getBean("t_shirt");
        System.out.println(t_shirt);
//        for calling destroy method
        context.registerShutdownHook();
    }

}
