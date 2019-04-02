package com.OOPS.sample1;

public class OPPSApproach1 {

	public static void main(String[] args) {
		CalculateForOOPS<Integer> calculateForOOPS = new AddOperation();
		int result = calculateForOOPS.operate(5, 6);
		calculateForOOPS = new MultipleOperation();
		result = calculateForOOPS.operate(result, 6);
		calculateForOOPS = new SubstractOperation();
		result = calculateForOOPS.operate(result, 1);
		calculateForOOPS = new DivideOperation();
		result = calculateForOOPS.operate(result, 5);
		System.out.println(result);
	}
}

interface CalculateForOOPS<E> {
	public E operate(E operand1, E opernad2);
}

class AddOperation implements CalculateForOOPS<Integer> {
	@Override
	public Integer operate(Integer operand1, Integer opernad2) {
		return operand1 + opernad2;
	}
}

class SubstractOperation implements CalculateForOOPS<Integer> {

	@Override
	public Integer operate(Integer operand1, Integer opernad2) {
		return operand1 - opernad2;
	}
}

class MultipleOperation implements CalculateForOOPS<Integer> {
	@Override
	public Integer operate(Integer operand1, Integer opernad2) {
		return operand1 * opernad2;
	}
}

class DivideOperation implements CalculateForOOPS<Integer> {
	@Override
	public Integer operate(Integer operand1, Integer opernad2) {
		return operand1 / opernad2;
	}
}