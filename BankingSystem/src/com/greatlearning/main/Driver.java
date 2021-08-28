package com.greatlearning.main;

import com.greatlearning.models.Customer;
import com.greatlearning.services.BankingService;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		BankingService bankingService = new BankingService();

	    Customer customer1 = new Customer("password",123456);

	    Scanner sc = new Scanner(System.in);

	    String password;
	    int bankAccountNo;

	    System.out.println("Enter account");
	    bankAccountNo = sc.nextInt();
	    System.out.println("Enter password");
	    password  = sc.next();

	    Customer loggedInCustomer = new Customer(password,bankAccountNo);

	    if(bankingService.validateCustomer(loggedInCustomer,customer1)){
	       System.out.println("Valid customer");
	       int option = 0;
	       do {
	    	   System.out.println("--------------------------------------");
	    	   System.out.println("Please enter the transaction to perform");
	    	   System.out.println("1. Deposit");
	    	   System.out.println("2. Withdrawal");
	    	   System.out.println("3. Transfer");
	    	   System.out.println("0. Logout");
	    	   System.out.println("--------------------------------------");
	    	   option = sc.nextInt();
	    	   
	    	   switch(option) {
	    	   case 0:
	    		   option = 0;
	    		   bankingService.logOut();
	    		   break;
	    		   
	    	   case 1:
	    		   bankingService.deposit(loggedInCustomer);
	    		   break;
	    		   
	    	   case 2:
	    		   bankingService.withdraw(loggedInCustomer,"withdraw");
	    		   break;
	    		   
	    	   case 3:
	    		   bankingService.withdraw(loggedInCustomer,"transfer");
	    		   break;
	    	   }
	       } while (option != 0);
	    }
	    else{
	        System.out.println("Please enter valid credentials");
	    }
	}
}
