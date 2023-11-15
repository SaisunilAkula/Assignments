package com.account.main;

import com.account.utilty.CRUDOperations;

public class AccountMain {

	public static void main(String[] args) {
		CRUDOperations cd = new CRUDOperations();
		cd.insertEntity();
		cd.credit(5000);
		cd.debit(2999);
		
	}

}
