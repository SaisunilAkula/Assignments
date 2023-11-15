package com.customer.main;

public class Account {
private int id;
private String name;
private int accountBalance;
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
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}
public Account(int id, String name, int accountBalance) {
	super();
	this.id = id;
	this.name = name;
	this.accountBalance = accountBalance;
}
public Account() {
	super();
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", accountBalance=" + accountBalance + "]";
}


}
