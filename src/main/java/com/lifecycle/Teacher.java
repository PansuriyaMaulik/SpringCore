package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void Start()
    {
        System.out.println("Staring Method : init");
    }

    @PreDestroy
    public void End()
    {
        System.out.println("Ending Method : destroy");
    }
}
