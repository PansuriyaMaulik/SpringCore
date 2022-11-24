package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");

       Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp);
    }
}
