package com.springCore.four_lifeCycle.using_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class potato {
    private int price;

    public potato() {
    }

    @Override
    public String toString() {
        return "potato{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @PostConstruct
    public void init(){
        System.out.println("inside Potato");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy Potato");
    }
}
