package com.springCore.two_constructorInjection;


public class Person {
    private String name;
    private int age;
    private Certificats certificats;

    public Person(String name, int age, Certificats certificate) {
        this.name = name;
        this.age = age;
        this.certificats=certificate;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", certificats=" + certificats +
                '}';
    }
}
