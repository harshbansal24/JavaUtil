package com.designPattern.decoraor.headFirstSample;

import com.designPattern.decoraor.headFirstSample.Beverage;
import com.designPattern.decoraor.headFirstSample.impl.CapicinnoBeverage;
import com.designPattern.decoraor.headFirstSample.impl.SoyaMilkAddOnDecorator;

public class BeverageMainClass {

	public BeverageMainClass() {
	}

	public static void main(String[] args) {
		Beverage capicinnoSoyaMilk = new SoyaMilkAddOnDecorator(new CapicinnoBeverage());
		System.out.println(capicinnoSoyaMilk.getCost());
	}
}