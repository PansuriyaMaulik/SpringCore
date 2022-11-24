package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stereotype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
    }
}
