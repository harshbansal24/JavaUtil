package com.harsh.threads.helper;

import java.util.concurrent.Callable;

public class CallabaleExample implements Callable<String> {

	private int iValue;

	public CallabaleExample(int iValue) {
		this.iValue = iValue;
	}

	@Override
	public String call() throws InterruptedException {
		System.out.println("Called " + iValue);
		Thread.sleep(2000);
		return "0";
	}

}
