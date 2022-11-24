package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private double rollNo;

    public double getRollNo() {
        return rollNo;
    }

    public void setRollNo(double rollNo) {
        this.rollNo = rollNo;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("getting student rollNo: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("after drinking : destroy");
    }
}
