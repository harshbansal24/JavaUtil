package com.designPattern.factoryPattern.sample1;

public abstract class Account {

	public void deposit() {
		System.out.println("Deposited the amount");
	}

	public void withdraw() {
		System.out.println("Withdraw the amount");
	}

	public abstract String getAccountType();

}
