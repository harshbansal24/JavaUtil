package com.designPattern.strategy.sample2;

public class StrategySample2Main {
	public static void main(String[] args) {
		Animal doggy = new Dog();
		doggy.flyAnimal();
		doggy.canLayEgg();
		Animal bird = new Bird();
		bird.flyAnimal();
		bird.canLayEgg();
	}
}
