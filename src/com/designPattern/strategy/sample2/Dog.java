package com.designPattern.strategy.sample2;

public class Dog extends Animal implements CanEgg {
	public Dog() {
		setFly(new CannotFly());
	}

	@Override
	public void canLayEgg() {
		System.out.println("---Dog cann't lay egg---");
	}

}
