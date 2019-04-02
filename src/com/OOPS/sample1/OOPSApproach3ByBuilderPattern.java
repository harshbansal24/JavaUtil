package com.OOPS.sample1;

import java.util.HashMap;
import java.util.Map;

public class OOPSApproach3ByBuilderPattern {

	public static void main(String[] args) {
		CalculateByBuilder.CalculateBuilderClass calculateByBuilderClass = new CalculateByBuilder.CalculateBuilderClass(
				5).operate(CalculatorOperators.ADD, 6).operate(CalculatorOperators.MULIPLE, 6)
						.operate(CalculatorOperators.SUBTRACT, 1).operate(CalculatorOperators.DIVIDE, 5);
		CalculateByBuilder calculateByBuilder = new CalculateByBuilder(calculateByBuilderClass);
		System.out.println(calculateByBuilder.getValue());
	}
}

class CalculateByBuilder {
	Integer result;

	public CalculateByBuilder(CalculateBuilderClass builderClass) {
		this.result = builderClass.result;
	}

	public int getValue() {
		return this.result;
	}

	static class CalculateBuilderClass {
		Map<CalculatorOperators, CalculateForOOPS<Integer>> map = new HashMap<>();
		protected Integer result;

		public CalculateBuilderClass(Integer initialParam) {
			init();
			this.result = initialParam;
		}

		private void init() {
			map.put(CalculatorOperators.ADD, new AddOperation());
			map.put(CalculatorOperators.SUBTRACT, new SubstractOperation());
			map.put(CalculatorOperators.MULIPLE, new MultipleOperation());
			map.put(CalculatorOperators.DIVIDE, new DivideOperation());
		}

		public CalculateBuilderClass operate(CalculatorOperators calculatorOperators, Integer operand1) {
			CalculateForOOPS<Integer> calculateForOOPS = map.get(calculatorOperators);
			result = calculateForOOPS.operate(result, operand1);
			return this;
		}
	}
}