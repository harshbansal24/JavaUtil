package com.harsh.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

/**
 * This class demonstrate the use of semaphore. There will be 200 calls to a
 * class called Connection but at any time we want only 5 to access those
 * connection class.
 * 
 * Semaphore is used when you want to run many thread but at any time you want
 * handful of threads to run
 *
 */
public class SemaphoreSample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 40; i++) {
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					try {
						Connection.getConnection().connect();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.DAYS);
	}
}

class Connection {
	private int createdConnection = 0;
	Semaphore semaphore = new Semaphore(5);

	private Connection() {
	}

	public void connect() throws InterruptedException{
		semaphore.acquire();
		try{
			doConnect();
		}
		finally {
			semaphore.release();
		}
	}
	
	public void doConnect() throws InterruptedException {
		
		synchronized (this) {
			createdConnection++;
		}
		Thread.sleep(1000);
		System.out.println("Created Connection " + createdConnection);
		synchronized (this) {
			createdConnection--;
		}
	}

	private static Connection connection = new Connection();

	public static Connection getConnection() {
		return connection;
	}

}