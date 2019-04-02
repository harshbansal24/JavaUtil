package com.designPattern.factoryPattern.sample1;

public class LoanAccount extends Account {

	@Override
	public String getAccountType() {
		System.out.println("Loan Account");
		return "Loan";
		
	}

}
