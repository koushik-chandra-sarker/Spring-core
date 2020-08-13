package com.springCore.seven_StereotypeAnnotation.Collection_With_Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teach")
public class Teacher {
    @Value("Ahisk bihan")
    private String name;
    @Value("Khulna")
    private String city;

    @Value("#{address}")
    private List<String > address;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
