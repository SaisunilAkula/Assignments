package com.customer.main;

public class Customer {
     
	private int id;
	private String name;
	private int phonenumber;
	Account account;
	

	public Customer(int id, String name, int phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
	}
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
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", account=" + account + "]";
	}

	
}
