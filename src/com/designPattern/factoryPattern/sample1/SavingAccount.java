package com.designPattern.factoryPattern.sample1;

public class SavingAccount extends Account {

	@Override
	public String getAccountType() {
		System.out.println("Saving Account");
		return "Saving";
	}

}
