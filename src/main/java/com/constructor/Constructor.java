package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorconfig.xml");

       Person person = (Person) context.getBean("person");
       System.out.println(person);

        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();
    }
}
