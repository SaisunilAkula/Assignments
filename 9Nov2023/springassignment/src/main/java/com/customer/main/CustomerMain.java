package com.customer.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("customercontext.xml");
      
      Customer c1 = (Customer) context.getBean("customerbean",Customer.class);
//      Account a1 = (Account) context.getBean("account",Account.class);
       System.out.println(c1.toString());
	}
    
}
