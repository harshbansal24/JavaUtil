package com.designPattern.observer.sample1;

public interface Observer {

	public void update(String stockSymbol, Float stockValue, Integer stockUnits);
}