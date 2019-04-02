package com.harsh.threads.helper;

import java.util.Random;
import java.util.concurrent.Callable;

public class FutureTaskExample<String> implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		System.out.println("in call method");
		return (String) Thread.currentThread().getName();
	}


}
