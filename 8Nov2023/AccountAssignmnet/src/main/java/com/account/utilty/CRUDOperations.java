package com.account.utilty;

import com.account.*;
import com.account.main.Account;
import com.account.main.Credit;
import com.account.main.Debit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CRUDOperations {
	public void insertEntity() {
    EntityManager  entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
    Account a1 = new Account( "Rahul", 8000);
    entityManager.persist(a1);
    entityManager.getTransaction().commit();
    entityTransaction.begin();
    Account a2 = new Account( "Sai", 10000);
    entityManager.persist(a2);
    entityManager.getTransaction().commit();
    entityTransaction.begin();
    Account a3 = new Account( "Varma", 7000);
    entityManager.persist(a3);
    entityManager.getTransaction().commit();
    entityManager.close();
}

//public void findEntity() {
//    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//    entityManager.getTransaction().begin();
//    
//    Account empObj = entityManager.find(Account.class, 5);
////    System.out.println(empObj.getEmpno());
////    System.out.println(empObj.getName());
////    System.out.println(empObj.getSalary());
//    System.out.print(empObj.toString());
//
//    
//    entityManager.getTransaction().commit();
//    entityManager.close();
//}
//
public void credit(int amount) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
  Account a1 = entityManager.find(Account.class, 2);

    Credit c1 = new Credit(a1.getName(),a1.getSalary(),8000);
    
    
    
    entityManager.persist(c1);
    entityManager.getTransaction().commit();
    

//    System.out.println(c1.toString());
//    Account a1 = entityManager.find(Account.class, 2);
//    System.out.println(c1.toString());
    // The entity object is physically updated in the database when the transaction
    // is committed
   
    c1.setAmount(amount);
    c1.setSalary(amount+a1.getSalary());
   
    
    
    System.out.println(c1.toString());

    entityManager.getTransaction().commit();
    entityManager.close();
}
public void debit(int amount) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
  Account a1 = entityManager.find(Account.class, 1);

    Debit d1 = new Debit(a1.getName(),a1.getSalary(),2000);
    
    
    
    entityManager.persist(d1);
    entityManager.getTransaction().commit();
    d1.setAmount(amount);
    d1.setSalary(amount-a1.getSalary());
   
    

//    System.out.println(c1.toString());
//    Account a1 = entityManager.find(Account.class, 2);
//    System.out.println(c1.toString());
    // The entity object is physically updated in the database when the transaction
    // is committed
   
   
    
    
    System.out.println(d1.toString());

    entityManager.getTransaction().commit();
    entityManager.close();
}

//public void removeEntity() {
//    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//    entityManager.getTransaction().begin();
//    Account empObj = entityManager.find(Account.class, 1);
//    System.out.println(empObj.toString());
//    entityManager.remove(empObj);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//}
}