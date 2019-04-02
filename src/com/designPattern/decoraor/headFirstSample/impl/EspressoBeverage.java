package com.designPattern.decoraor.headFirstSample.impl;

import com.designPattern.decoraor.headFirstSample.Beverage;

public class EspressoBeverage extends Beverage {

	public EspressoBeverage() {
		
	}

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public double getCost() {
		return 1.5d;
	}

}
