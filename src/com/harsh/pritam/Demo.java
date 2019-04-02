package com.harsh.pritam;

class Demo {
	
	synchronized public  static void method1() {
	 try {
		Thread.sleep(10);
		System.out.println("method1:....");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
	
	synchronized public static void method2() {
		 try {
			Thread.sleep(1000);
			for(int i=0;i<10;i++) {
				System.out.println("method2:"+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
} 