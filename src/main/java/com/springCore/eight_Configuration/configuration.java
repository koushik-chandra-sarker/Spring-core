package com.springCore.eight_Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springCore.eight_Configuration")
public class configuration {
    @Bean
    public Address getAddress(){
        return new Address();
    }
    @Bean
    public Student getStudent(){
        return new Student(getAddress());
    }


}
