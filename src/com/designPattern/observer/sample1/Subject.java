package com.designPattern.observer.sample1;

public interface Subject {
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
