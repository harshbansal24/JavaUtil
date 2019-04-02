package com.harsh.threads.main;

public class HandlingUncaughtException implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside the run method");
		System.out.println(10/0);

	}

}
