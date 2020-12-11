package com.java.excercises.operations;

public class MathematicOperations {
	public double getPlusOperation(double numA, double numB) {
		double result;
		result = numA + numB;
		return result;
	}

	public double getMultiplyOperation(double numA, double numB) {
		double result;
		result = numA * numB;
		return result;
	}

	public double getBiggestNumber(double numA, double numB) {
		double biggestnumber;
		if (numA > numB) {
			biggestnumber = numA;
		} else {
			biggestnumber = numB;
		}
		return biggestnumber;
	}

	public static void main(String[] args) {
		MathematicOperations operation = new MathematicOperations();
		double biggestnumber;
		biggestnumber = operation.getBiggestNumber(14, 51);
		System.out.println("Mensaje:" + biggestnumber);

	}

}
