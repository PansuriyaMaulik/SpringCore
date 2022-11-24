package com.withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Using Component Scan
@Component
public class Student {
    private Teacher teacher;

    @Value("Jay")
    private String name;

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                '}';
    }
}
