package com.withoutxml;

public class Teacher {
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course='" + course + '\'' +
                '}';
    }
}
