package com.designPattern.factoryPattern.sample1;

public class BankAccountFactory {

	public Account getAccount(String strAccountType) {
		Account account = null;
		if ("saving".equals(strAccountType)) {
			account = new SavingAccount();
		} else if ("loan".equals(strAccountType)) {
			account = new LoanAccount();
		} else if ("checking".equals(strAccountType)) {
			account = new CheckingAccount();
		}
		return account;
	}
}
