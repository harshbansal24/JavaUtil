package com.designPattern.strategy.sample2;

public class Bird extends Animal implements CanEgg {
	public Bird() {
		setFly(new CanFly());
	}

	@Override
	public void canLayEgg() {
		System.out.println("---Bird can lay egg---");
	}

}
