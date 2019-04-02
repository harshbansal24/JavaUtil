package com.harsh.threads.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSolverSample {

	public static void main(String[] args) {
		{
			DeadLockSolver deadLockSolver = new DeadLockSolver();
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						deadLockSolver.firstThread();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						deadLockSolver.secondThread();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			deadLockSolver.finished();
			System.out.println("Dead Lock solved");
		}
		{
			System.out.println("Dead Lock Code");
			DeadLockRunner deadLockRunner = new DeadLockRunner();
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					deadLockRunner.firstThread();
				}
			});
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					deadLockRunner.secondThread();
				}
			});
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			deadLockRunner.finished();
		}
		System.out.println("Dead Lock Code solved");
	}

}

class DeadLockSolver {

	Account acc1 = new Account();
	Account acc2 = new Account();
	Random random = new Random();
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();

	public void finished() {
		System.out.println("Total " + (acc1.getBalance() + acc2.getBalance()));
	}

	public void acquireLock(Lock lock1, Lock lock2) throws InterruptedException {
		while (true) {
			boolean gotLock1 = false;
			boolean gotLock2 = false;
			try {
				gotLock1 = lock1.tryLock();
				gotLock2 = lock2.tryLock();
			} finally {
				if (gotLock1 && gotLock2) {
					return;
				}
				if (gotLock1) {
					lock1.unlock();
				}
				if (gotLock2) {
					lock2.unlock();
				}
			}
			Thread.sleep(100);
		}
	}

	public void firstThread() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			acquireLock(lock1, lock2);
			try {
				acc1.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}
	}

	public void secondThread() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			acquireLock(lock2, lock1);
			try {
				acc1.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}

	}

}

class DeadLockRunner {
	Account acc1 = new Account();
	Account acc2 = new Account();
	Random random = new Random();
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();

	public void finished() {
		System.out.println("Total " + (acc1.getBalance() + acc2.getBalance()));
	}

	public void firstThread() {
		for (int i = 0; i < 1000; i++) {
			lock1.lock();
			lock2.lock();
			try {
				acc1.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}
	}

	public void secondThread() {
		for (int i = 0; i < 1000; i++) {
			lock2.lock();
			lock1.lock();
			try {
				acc1.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}

	}

}