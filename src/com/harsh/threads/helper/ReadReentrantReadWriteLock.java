package com.harsh.threads.helper;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadReentrantReadWriteLock implements Runnable {

	private ReentrantReadWriteLock reentrantReadWriteLock;
	private List<String> listaStr;

	public ReadReentrantReadWriteLock(ReentrantReadWriteLock reentrantReadWriteLock, List<String> listaStr) {
		this.reentrantReadWriteLock = reentrantReadWriteLock;
		this.listaStr = listaStr;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.reentrantReadWriteLock.readLock().lock();
			System.out.println("Read " + listaStr);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				this.reentrantReadWriteLock.readLock().unlock();
			}
		}
	}

}
