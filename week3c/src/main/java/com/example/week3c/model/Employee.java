package com.example.week3c.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private Long id = 250101L;

    private String name = "Rahul Kumar";

    public String department;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayEmployeeDetails() {
        System.out.println(
            "[Employee Component] ID: " + id +
            ", Name: " + name
        );

    }
    @Override
public String toString() {
    return "Employee [ID=" + id + ", Name=" + name + ", Dept=" + department + "]";
}
}   