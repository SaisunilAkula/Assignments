package com.microservice.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeems")
public class Employee {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Long Salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

//    public Employee(Long id, String name, Long salary) {
//        this.id = id;
//        this.name = name;
//        Salary = salary;
//    }

    public Employee() {
    }
}
