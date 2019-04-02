package com.designPattern.factoryPattern.sample1;

public class AccountOpening {
	public static void main(String arg[]) {
		BankAccountFactory bankAccountFactory = new BankAccountFactory();
		Bank bank = new Bank(bankAccountFactory);
		bank.openAccount("saving");
	}
}
