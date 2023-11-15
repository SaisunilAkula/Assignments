package com.account.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="account")
public class Credit extends Account {
   
	@Column(name="credit")
	private int amount;

	public Credit(String name, int salary, int amount) {
		super(name, salary);
		this.amount = amount;
	}
	public Credit(int amount) {
		
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Credit(String name, int salary) {
		super(name, salary);
	}

	@Override
	public String toString() {
		return "Credit [amount=" + amount + "]";
	}

	
	
	
	
	
}
