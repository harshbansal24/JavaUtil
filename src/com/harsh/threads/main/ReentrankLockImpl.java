package com.harsh.threads.main;

public class ReentrankLockImpl {

	public ReentrankLockImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * this is to keep the status if locked is acquired or not.
	 */
	boolean isLocked = false;

	/**
	 * This will keep the instance of current thread so it can be checked in
	 * future.
	 */
	Thread lockedBy = null;

	/**
	 * This keeps the count of lock. it is incremented in lock method and
	 * decreased in unlock method
	 * 
	 */
	int lockedCount = 0;

	public synchronized void lock() {
		Thread callingThread = Thread.currentThread();
		if (isLocked && lockedBy != callingThread) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		isLocked = true;
		lockedBy = callingThread;
		lockedCount++;
	}

	public synchronized void unlock() {
		if (Thread.currentThread() == this.lockedBy) {
			lockedCount--;
		}
		if (lockedCount == 0) {
			isLocked = false;
			notify();
		}
	}
}
