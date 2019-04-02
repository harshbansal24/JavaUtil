package com.OOPS.sample1;

public class ProceduralProgram implements Calculate {

	public static void main(String[] args) {
		ProceduralProgram proceduralProgram = new ProceduralProgram();
		int result = proceduralProgram.operate(5, 6, CalculatorOperators.ADD);
		result = proceduralProgram.operate(result, 6, CalculatorOperators.MULIPLE);
		result = proceduralProgram.operate(result, 1, CalculatorOperators.SUBTRACT);
		result = proceduralProgram.operate(result, 5, CalculatorOperators.DIVIDE);
		System.out.println(result);
	}

	@Override
	public int operate(int operand1, int opernad2, CalculatorOperators calculatorOperators) {
		switch (calculatorOperators) {
		case ADD:
			return operand1 + opernad2;
		case SUBTRACT:
			return operand1 - opernad2;
		case MULIPLE:
			return operand1 * opernad2;
		case DIVIDE:
			return operand1 / opernad2;
		default:
			break;
		}
		return 0;
	}

}

interface Calculate {
	public int operate(int operand1, int opernad2, CalculatorOperators calculatorOperators);
}

enum CalculatorOperators {
	ADD, SUBTRACT, MULIPLE, DIVIDE;
}