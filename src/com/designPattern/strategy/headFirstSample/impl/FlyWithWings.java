package com.designPattern.strategy.headFirstSample.impl;

import com.designPattern.strategy.headFirstSample.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	public FlyWithWings() {
	}

	@Override
	public void fly() {
		System.out.println("---Fly with Wings---");
	}

}
