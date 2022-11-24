package com.autowire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside Constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
