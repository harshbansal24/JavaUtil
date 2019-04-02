package com.harsh.threads.helper;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteReentrantReadWriteLock implements Runnable {

	private ReentrantReadWriteLock reentrantReadWriteLock;
	private List<String> listaStr;

	public ReadWriteReentrantReadWriteLock(ReentrantReadWriteLock reentrantReadWriteLock, List<String> listaStr) {
		this.reentrantReadWriteLock = reentrantReadWriteLock;
		this.listaStr = listaStr;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.reentrantReadWriteLock.writeLock().lock();
			System.out.println("Read Write ");
			listaStr.add(String.valueOf(i) + "rw");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				this.reentrantReadWriteLock.writeLock().unlock();
			}
		}
	}

}
