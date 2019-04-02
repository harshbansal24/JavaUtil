package com.designPattern.factoryPattern.sample1;

public class Bank {

	BankAccountFactory bankAccountFactory;

	public Bank(BankAccountFactory bankAccountFactory) {
		super();
		this.bankAccountFactory = bankAccountFactory;
	}

	public void openAccount(String strAccountType) {
		Account account = this.bankAccountFactory.getAccount(strAccountType);
		account.deposit();
		account.withdraw();
		System.out.println("Bank account " + account.getAccountType() + " opened!!!!");
	}
}
