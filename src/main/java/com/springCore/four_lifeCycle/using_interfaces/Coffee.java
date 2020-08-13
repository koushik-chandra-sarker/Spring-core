package com.springCore.four_lifeCycle.using_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coffee implements InitializingBean, DisposableBean {
    private int price;

    public Coffee() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "coffee{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init method");
    }

    public void destroy() throws Exception {
        System.out.println("inside destroy method");
    }
}
