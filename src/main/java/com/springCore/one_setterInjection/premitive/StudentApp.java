package com.springCore.one_setterInjection.premitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        students student1 = (students) context.getBean("students1");
        students student2 = (students) context.getBean("students2");
        System.out.println(student1);
        System.out.println(student2);
    }
}
