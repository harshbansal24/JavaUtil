package com.designPattern.decoraor.headFirstSample.impl;

import com.designPattern.decoraor.headFirstSample.Beverage;

public class CapicinnoBeverage extends Beverage {

	public CapicinnoBeverage() {
	}

	@Override
	public String getDescription() {
		return "Capicinno";
	}

	@Override
	public double getCost() {
		return 2.2d;
	}

}
