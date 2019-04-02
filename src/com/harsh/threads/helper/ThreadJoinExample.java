package com.harsh.threads.helper;

import java.util.concurrent.TimeUnit;

public class ThreadJoinExample extends Thread {

	private String str;
	private int iCount;
	private Thread t;
	private volatile boolean iExit = true;

	public ThreadJoinExample(String strThreadName, int iCount) {
		str = strThreadName;
		this.iCount = iCount;
	}

	public ThreadJoinExample(String strThreadName, int iCount, Thread t) {
		str = strThreadName;
		this.iCount = iCount;
		this.t = t;
	}

	public void run() {
		int i = 0;
		while (i < iCount && iExit ) {
			System.out.println("In run " + str + " " + i);
			try {
				Thread.sleep(100 * iCount);
//				TimeUnit.MINUTES.sleep(iCount/100);
//				TimeUnit.MINUTES.timedJoin(t1, timeout);
				i++;
				if (t != null) {
					TimeUnit.MINUTES.timedJoin(t, 0);
//					t.join();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == iCount) {
				return;
			}
		}
	}
	
	public void stopThread(){
		iExit = false;
	}
}
