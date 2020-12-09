package com.java.excercises;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String titulo="Operaciones Matemáticas";
		System.out.println(titulo); 
		
		System.out.println();
		System.out.println("Suma");
		int numA = 5;
		int numB = 2;
		
		float numC =10;
		float numD =3;
		
		double numE =100;
		double numF =27;
		
		
		System.out.println("La suma de A y B es: " + (numA + numB));
		System.out.println();

		System.out.println("Resta");
		System.out.println("La resta de A y B es: " + (numA - numB));
		System.out.println();

		System.out.println("División");
		System.out.println("La división de E y F es: " + (numE / numF));
		System.out.println();

		System.out.println("Multiplicación");
		System.out.println("La multiplicación de A y B es: " + (numA * numB));

	}
}
