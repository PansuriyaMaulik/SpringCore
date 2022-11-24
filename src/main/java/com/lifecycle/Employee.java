package com.lifecycle;

public class Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        System.out.println("Setting Salary ");
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }

    public void init()
    {
        System.out.println("Inside Init method");
    }

    public void destroy()
    {
        System.out.println("Inside destroy method");
    }
}
