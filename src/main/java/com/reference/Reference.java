package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reference {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");

        A a = (A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getObj().getY());
    }
}
