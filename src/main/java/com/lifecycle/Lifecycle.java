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
    }
}
