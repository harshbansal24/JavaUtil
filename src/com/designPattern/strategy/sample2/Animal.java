package com.designPattern.strategy.sample2;

public class Animal {

	private Fly flyObject;
	private CanEgg canEgg;
	
	public void test(){
		System.out.println("Animal Test");
	}
	
	public void setFly(Fly flyObject){
		this.flyObject = flyObject;
	}
	
	public void flyAnimal(){
		this.flyObject.flyAnimal();
	}
	
	public void canLayEgg() {
		this.canEgg.canLayEgg();
	}
}