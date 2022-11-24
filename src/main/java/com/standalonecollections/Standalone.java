package com.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");

        Person person = (Person) context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println("--------List Collection---------");
        System.out.println(person.getFriends());
        System.out.println(person.getFriends().getClass().getName());

        System.out.println("--------Map Collection---------");
        System.out.println(person.getFeestructure());
        System.out.println(person.getFeestructure().getClass().getName());

        System.out.println("--------Properties Collection---------");
        System.out.println(person.getProperties());
    }
}
