package com.springCore.four_lifeCycle.using_bean_initialize;

public class T_Shirt {
    private int price;

    public T_Shirt() {
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public T_Shirt(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "T_Shirt{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("init method call");
    }
    public void destroy(){
        System.out.println("destroy method call");
    }
}
