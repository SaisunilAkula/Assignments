package com.account.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Debit extends Account {
	@Column(name="debit") 
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Debit(String name, int salary, int amount) {
		super(name, salary);
		this.amount = amount;
	}

	public Debit(String name, int salary) {
		super(name, salary);
	}

	@Override
	public String toString() {
		return "Debit [amount=" + amount + "]";
	}

	
	
	
	
    
}
