package com.designPattern.observer.sample1;

public class IncomeHandlerImpl implements Observer {

	Subject stockData = null;

	public IncomeHandlerImpl(Subject stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}

	@Override
	public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
		System.out.println("IncomeHandler received changes... ");
	}

}