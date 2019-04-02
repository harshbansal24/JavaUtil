package com.harsh.threads.main;

import java.lang.Thread.UncaughtExceptionHandler;

public class UncaughtExceptionHandlerByUser implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("OMG");
		System.out.println("Exception is raised in thread " + t.getName());
		System.out.println("Exception is details in Handler Class Starts");
		e.printStackTrace();
		System.out.println("Exception is details in Handler Class Ends");
	}

}
