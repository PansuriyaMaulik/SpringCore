package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stereotype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());

        // After changing the scope of the class in scope annotation --- return different hashcode
        System.out.println("---------------changing the scope of the class using scope annotation --------------");
        System.out.println(student.hashCode());

        Student student2 = context.getBean("student1", Student.class);
        System.out.println(student2.hashCode());

        // After changing the scope of the class using XML --- return different hashcode
        System.out.println("---------------changing the scope of the class using XML--------------");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher.hashCode());

        Teacher teacher2 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher2.hashCode());

    }
}
