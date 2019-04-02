package com.designPattern.strategy.headFirstSample.impl;

import com.designPattern.strategy.headFirstSample.FlyBehaviour;

public class FlyWithNoWings implements FlyBehaviour {

	public FlyWithNoWings() {
	}

	@Override
	public void fly() {
		System.out.println("---Cann't fly as no wings---");
	}

}
