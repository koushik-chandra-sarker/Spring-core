package com.springCore.six_StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollectionConfig.xml");
        Parson parson = context.getBean("parson1",Parson.class);
        System.out.println(parson);
        System.out.println(parson.getFriends().getClass().getName());
    }
}
