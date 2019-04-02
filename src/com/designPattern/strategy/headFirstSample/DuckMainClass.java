/**
 * 
 */
package com.designPattern.strategy.headFirstSample;

import com.designPattern.strategy.headFirstSample.impl.FlyWithNoWings;

public class DuckMainClass {

	public DuckMainClass() {
	}

	public static void main(String[] args) {
		Duck zooDuck = new ZooDuck();
		zooDuck.performFLy();
		zooDuck.performQuack();
		zooDuck.changeFlyBehaviour(new FlyWithNoWings());
		zooDuck.performFLy();
	}

}
