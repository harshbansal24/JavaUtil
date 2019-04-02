package com.designPattern.strategy.headFirstSample.impl;

import com.designPattern.strategy.headFirstSample.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	public MuteQuack() {
	}

	@Override
	public void quack() {
		System.out.println("---Cann't Quack---");
	}

}
