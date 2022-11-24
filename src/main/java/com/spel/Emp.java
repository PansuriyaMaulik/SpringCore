package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
    //value assign using spring expression lang
    @Value("#{22+11}")
    private int x;

    @Value("#{1*2*3}")
    private  int y;

    //Apply static method using spring expression lang
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    //Apply static variable using spring expression lang
    @Value("#{T(java.lang.Math).E}")
    private double e;

    //create object using spring expression lang
    @Value("#{new java.lang.String('Nayan')}")
    private String name;

    //Assign boolean value using spring expression lang
    @Value("#{8>3}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
