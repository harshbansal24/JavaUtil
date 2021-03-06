package com.designPattern.observer.sample1;

import java.util.List;

public class StockData implements Subject {

	private String stockSymbol = null;
	private Float stockValue = null;
	private Integer stockUnits = null;
	private List<Observer> observers = null;

	public StockData() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(stockSymbol, stockValue, stockUnits);
		}
	}

	public void setStockData(String stockSymbol, Float stockValue, Integer stockUnits) {
		// In real-time, this method might be invoked with values from a live
		// web service at regular intervals.
		this.stockSymbol = stockSymbol;
		this.stockValue = stockValue;
		this.stockUnits = stockUnits;
		setDataChanged();
	}

	private void setDataChanged() {
		notifyObservers();
	}

}
