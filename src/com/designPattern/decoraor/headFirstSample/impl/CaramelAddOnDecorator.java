package com.designPattern.decoraor.headFirstSample.impl;

import com.designPattern.decoraor.headFirstSample.AddonDecorator;
import com.designPattern.decoraor.headFirstSample.Beverage;

public class CaramelAddOnDecorator extends AddonDecorator {

	private Beverage beverage;

	CaramelAddOnDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Caramel";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 1.12d;
	}

}
