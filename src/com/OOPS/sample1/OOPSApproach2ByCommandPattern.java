package com.OOPS.sample1;

import java.util.HashMap;
import java.util.Map;

public class OOPSApproach2ByCommandPattern {

	public static void main(String[] args) {
		CalculateByCommand byCommand = new  CalculateByCommand();
		int result = byCommand.operate(5, 6, CalculatorOperators.ADD);
		result = byCommand.operate(result, 6, CalculatorOperators.MULIPLE);
		result = byCommand.operate(result, 1, CalculatorOperators.SUBTRACT);
		result = byCommand.operate(result, 5, CalculatorOperators.DIVIDE);
		System.out.println(result);
	}

}

class CalculateByCommand {
	private static final Map<CalculatorOperators, CalculateForOOPS<Integer>> map = new HashMap<>();

	public CalculateByCommand() {
		map.put(CalculatorOperators.ADD, new AddOperation());
		map.put(CalculatorOperators.SUBTRACT, new SubstractOperation());
		map.put(CalculatorOperators.MULIPLE, new MultipleOperation());
		map.put(CalculatorOperators.DIVIDE, new DivideOperation());
	}

	public int operate(int operator1, int operator2, CalculatorOperators calculatorOperators) {
		CalculateForOOPS<Integer> calculateForOOPS = map.get(calculatorOperators);
		Integer operate = calculateForOOPS.operate(operator1, operator2);
		return operate;
	}
}