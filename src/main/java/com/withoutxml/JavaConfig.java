package com.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//declare component annotation in class
//@ComponentScan(basePackages = "com.withoutxml")
public class JavaConfig {

    @Bean
    public Teacher getTeacher() {
        return new Teacher("Java");
    }

    @Bean
    public Student getStudent() {
        //creating new student object
        Student student = new Student(getTeacher());
        return student;
    }
}
