package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");

        // Registering shutdown hook
        context.registerShutdownHook();

        System.out.println("__________Now using XML__________");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        System.out.println("__________Now using Interface__________");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        System.out.println("__________Now using Annotation__________");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }
}
