package com.java.excercises.operations;

public class MathematicOperations {
public int getResidue (int numA, int numB) {
	int result;
	result = numA+numB;
	return result;
}
	public static void main (String [] args) {
	MathematicOperations operation = new MathematicOperations();
	int result;
	result= operation.getResidue(22, 14);
	System.out.println("Rsult:" +result);
		
	}
}

