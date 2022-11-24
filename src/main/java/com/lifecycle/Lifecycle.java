package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Registering shutdown hook
        context.registerShutdownHook();

        System.out.println("__________Now using Interface__________");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
