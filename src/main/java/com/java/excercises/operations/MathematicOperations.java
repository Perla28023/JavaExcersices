package com.java.excercises.operations;

public class MathematicOperations {
	public double getPlusOperation(double numA, double numB) {
		double result;
		result = numA + numB;
		return result;
	}

	public static void main(String[] args) {
		MathematicOperations operation = new MathematicOperations();
		double result;
		result = operation.getPlusOperation(22.5, 14);
		System.out.println("Result:" + result);

	}
}
