package com.springCore.four_lifeCycle.using_annotation;

import com.springCore.four_lifeCycle.using_bean_initialize.T_Shirt;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class potatoApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");

        potato p = (potato) context.getBean("potato");
        System.out.println(p);
//        for calling destroy method
        context.registerShutdownHook();
    }
}
