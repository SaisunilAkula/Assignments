package com.account.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id")
   private int id;
   
   @Column(name="name")
   private String name;
   
   @Column(name="salary")
   private int salary;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Account( String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}

public Account() {
	super();
}
   
   
   
}
