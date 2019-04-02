package com.designPattern.strategy.headFirstSample.impl;

import com.designPattern.strategy.headFirstSample.QuackBehaviour;

public class LoudQuack implements QuackBehaviour {

	public LoudQuack() {
	}

	@Override
	public void quack() {
		System.out.println("---Loud Quack---");
	}

}
