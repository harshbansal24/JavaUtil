package com.designPattern.decoraor.headFirstSample.impl;

import com.designPattern.decoraor.headFirstSample.AddonDecorator;
import com.designPattern.decoraor.headFirstSample.Beverage;

public class SoyaMilkAddOnDecorator extends AddonDecorator {

	private Beverage beverage;

	public SoyaMilkAddOnDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "Soya Milk Add on";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 0.67d;
	}

}
