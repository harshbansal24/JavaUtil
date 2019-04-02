package com.designPattern.strategy.headFirstSample;

public class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {
	}

	public void performFLy() {
		flyBehaviour.fly();
	}

	public void changeFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void changeQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
