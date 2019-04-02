package com.harsh.pritam;

/**
 * The below class creates a thread which is supposed to throw an exception. A
 * handler is added to the thread before calling the start method of thread.
 * When the thread executes the exception is handled by the handler and the
 * custom exception message is displayed on the console.
 */

public class MyThreadTest {
	protected int sal = 0;

	public static void main(String[] args) {

		Thread newThread = new Thread(new ThreadWithException());

		// Add the handler to the thread object
		newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("ERROR! An exception occurred in " + t.getName() + ". Cause: " + e.getMessage());
			}
		});

		newThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Default ERROR! An exception occurred in " + t.getName() + ". Cause: " + e.getMessage());
			}
		});
		newThread.start();
	}
}

/**
 * This thread throws a custom exception in its run method.
 */

class ThreadWithException implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException("Application Specific Exception!!");
	}
}