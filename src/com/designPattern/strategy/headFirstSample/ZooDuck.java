package com.designPattern.strategy.headFirstSample;

import com.designPattern.strategy.headFirstSample.impl.FlyWithWings;
import com.designPattern.strategy.headFirstSample.impl.LoudQuack;

public class ZooDuck extends Duck {

	public ZooDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new LoudQuack();
	}

}
