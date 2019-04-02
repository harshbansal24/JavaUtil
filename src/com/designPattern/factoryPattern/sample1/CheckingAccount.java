package com.designPattern.factoryPattern.sample1;

public class CheckingAccount extends Account {

	@Override
	public String getAccountType() {
		System.out.println("Checking Account");
		return "Checking";
	}

}
