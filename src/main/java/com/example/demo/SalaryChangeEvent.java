package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {
    Employee employee;
    public SalaryChangeEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }
}
