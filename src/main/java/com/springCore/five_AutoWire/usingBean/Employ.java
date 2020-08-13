package com.springCore.five_AutoWire.usingBean;

public class Employ {
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
