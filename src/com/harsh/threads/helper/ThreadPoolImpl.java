package com.harsh.threads.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPoolImpl {

	boolean isStopped = false;
	BlockingQueue<Runnable> taskQueue = null;
	List<PoolThread> threads = new ArrayList<>();

	public ThreadPoolImpl(int noOfThread, int maxNoOfTask) {
		taskQueue = new ArrayBlockingQueue<>(maxNoOfTask);
		for (int i = 0; i < noOfThread; i++) {
			threads.add(new PoolThread(taskQueue));
		}

		for (PoolThread poolThread : threads) {
			poolThread.start();
		}
	}

	public synchronized void execute(Runnable runnable) {
		if (this.isStopped) {
			throw new IllegalStateException();
		}
		try {
			this.taskQueue.put(runnable);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void stop() {
		this.isStopped = false;
		for (PoolThread poolThread : threads) {
			poolThread.shutdown();
		}
	}
}

class PoolThread extends Thread {

	private BlockingQueue<Runnable> taskQueue;
	private boolean isStopped = false;

	public PoolThread(BlockingQueue<Runnable> taskQueue) {
		this.taskQueue = taskQueue;
	}

	public void shutdown() {
		this.interrupt();
	}

	@Override
	public void run() {
		while (!isStopped) {
			try {
				Runnable take = this.taskQueue.take();
				take.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}