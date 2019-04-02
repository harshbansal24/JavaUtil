package com.designPattern.strategy.sample2;

public class CannotFly implements Fly {

	@Override
	public void flyAnimal() {
		System.out.println("Animal cann't fly");

	}

}
