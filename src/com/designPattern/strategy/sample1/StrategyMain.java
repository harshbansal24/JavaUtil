package com.designPattern.strategy.sample1;

/**
 * 1. Define the interface of an interchangeable family of algorithms 2. Bury
 * algorithm implementation details in derived classes 3. Derived classes could
 * be implemented using the Template Method pattern 4. Clients of the algorithm
 * couple themselves strictly to the interface
 * 
 * 
 */
public class StrategyMain {

	public static void main(String[] args) {
		Strategy[] algorithm = {new FOO(),new BAR()};
		for(Strategy strategy : algorithm){
			strategy.solve();	
		}
	}

}

// 1. Define the interface of the algorithm
interface Strategy {
	void solve();
}

abstract class StrategySolution implements Strategy {
	public void solve() {
		System.out.println("Inside Strategy Solution");
		start();
		while (nextTry())
			isSolution();
		stop();
	}

	abstract void start();

	abstract boolean nextTry();

	abstract boolean isSolution();

	abstract void stop();
}

class FOO extends StrategySolution {
	private int state = 1;

	protected void start() {
		System.out.println("Start FOO  ");
	}

	protected void stop() {
		System.out.println("Stop FOO");
	}

	protected boolean nextTry() {
		System.out.println("NextTry-" + state++ + " FOO ");
		if (state == 3) {
			return false;
		}
		return true;
	}

	protected boolean isSolution() {
		System.out.println("IsSolution-" + (state == 3) + " FOO  ");
		return (state == 3);
	}
}

// 2. Bury implementation
abstract class StrategySearch implements Strategy {
	// 3. Template Method
	public void solve() {
		while (true) {
			preProcess();
			if (search()) {
				break;
			}
			postProcess();
		}
	}

	abstract void preProcess();

	abstract boolean search();

	abstract void postProcess();
}

@SuppressWarnings("ALL")
class BAR extends StrategySearch {
	private int state = 1;

	protected void preProcess() {
		System.out.println("PreProcess BAR ");
	}

	protected void postProcess() {
		System.out.println("PostProcess  BAR ");
	}

	protected boolean search() {
		System.out.println("Search-" + state++ + " BAR ");
		return state == 3 ? true : false;
	}
}
