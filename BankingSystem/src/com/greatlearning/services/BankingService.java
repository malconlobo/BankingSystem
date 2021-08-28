package com.greatlearning.services;

import java.util.Scanner;

import com.greatlearning.models.Customer;

public class BankingService {

	Scanner sc = new Scanner(System.in);

	public boolean validateCustomer(Customer loggedInCustomer, Customer customer1) {
		// TODO Auto-generated method stub
		return (loggedInCustomer.getAccount() == customer1.getAccount()
				&& loggedInCustomer.getPassword().equals(customer1.getPassword()));
	}

	public void logOut() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for banking with us!");

	}

	public void deposit(Customer customer) {
		// TODO Auto-generated method stub
		int amount;
		System.out.println("Please enter amount to be deposited");
		amount = sc.nextInt();
		if (amount > 0) {
			customer.setBankBalance(amount + customer.getBankBalance());
			System.out.println("Updated balance is " + customer.getBankBalance());
		} else {
			System.out.println("Please enter valid amount");
		}

	}

	public void withdraw(Customer customer, String operation) {
		// TODO Auto-generated method stub
		int amount;
		int pin;
		if (operation.equals("withdraw")) {
			System.out.println("Please enter the amount to be withdrawn");
		} else {
			System.out.println("Please enter the amount to be transferred");
		}

		amount = sc.nextInt();
		if (amount > customer.getBankBalance()) {
			System.out.println("Not enough funds in account");
		} else {
			System.out.println("Please enter the private pin");
			pin = sc.nextInt();
			if (pin == customer.getOtp()) {
				System.out.println("Pin validated successfully");
				customer.setBankBalance(customer.getBankBalance() - amount);
				System.out.println("Updated balance is " + customer.getBankBalance());
			}
			else {
				System.out.println("Please enter correct pin");
			}
		}

	}

}
