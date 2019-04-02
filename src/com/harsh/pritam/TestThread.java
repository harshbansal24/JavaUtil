package com.harsh.pritam;

public class TestThread implements Runnable {
	Demo d;
	int flag=0;
	TestThread(Demo d,int flg) {
		this.d = d;
		this.flag = flg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		if(flag ==1)
//			Demo.method1();
//		if(flag ==2)
//			Demo.method2();
	}
	
	public static void main(String args[]){
		
		Demo d1 = new Demo();
		//Demo d2= new Demo();
		Thread t1 = new Thread(new TestThread(d1,1));
		Thread t2= new Thread(new TestThread(d1,2));
		 
		t1.start();
		t2.start();
		
	}
}