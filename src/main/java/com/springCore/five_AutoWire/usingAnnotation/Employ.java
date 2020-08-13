package com.springCore.five_AutoWire.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employ {
    @Autowired
    @Qualifier("address-4")
    private Address address;

    public Employ(Address address) {
        this.address = address;
        System.out.println("inside constructor");
    }

    public Employ() {
    }

    public Address getAddress() {
        return address;

    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "address=" + address +
                '}';
    }
}
