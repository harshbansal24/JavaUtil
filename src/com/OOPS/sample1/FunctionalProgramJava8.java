package com.OOPS.sample1;

public class FunctionalProgramJava8 {

	public static void main(String[] args) {
//		MathOperation<Integer> calc = (x) -> MathOperation.init(5);

//		MathOperation<Integer> complexOp = calc.add(6).multiply(6).subtract(1).divide(5);
//
//		complexOp.print();
	}
}

@FunctionalInterface
interface MathOperation<Integer> {

	// SAM -- Single Abstract Method.
	// identifier abstract is optional
	Integer operate(Integer operand);

//	default MathOperation<Integer> add(Integer o) {
//		return (o1) -> operate(o1) + o;
//	}
//
//	default MathOperation<Integer> multiply(Integer o) {
//		return (o1) -> operate(o1) * o;
//	}
//
//	default MathOperation<Integer> subtract(Integer o) {
//		return (o1) -> operate(o1) - o;
//	}
//
//	default MathOperation<Integer> divide(Integer o) {
//		return (o1) -> operate(o1) / o;
//	}
//
//	default Integer getResult() {
//		return operate(0);
//	}
//
//	default void print() {
//		System.out.println("result=" + getResult());
//	}
//
//	// static helper to initialize
//	static Integer init(Integer input) {
//		return input;
//	}

}