package com.java.excercises.school;

import java.util.ArrayList;
import java.util.List;

public class StudentPayments {

	
public static	List<String> studentList = new ArrayList<>();

	
	public List<String> addStudentToList(int idStudent,String studentName, String career,double payment) {		
		studentList.add(idStudent+" "+studentName+" "+career+" "+payment);
		return studentList;
		
	}
	
	public void showStudentList (List<String> studentList) {
		
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("Fin de la lista");
	}
	
	public static void main (String[] args) {
		StudentPayments studentPayments = new StudentPayments();
		
		int idStudent;
		String studentName;
		String career;
		double payment;
		
		idStudent = 1;
		studentName= "Hayley";
		career="TICS";
		payment= 4500.00;
		
		int idStudent2;
		String studentName2;
		String career2;
		double payment2;
		
		idStudent2 = 2;
		studentName2= "Taylor";
		career2="TICS";
		payment2= 3500.00;
		
		int idStudent3;
		String studentName3;
		String career3;
		double payment3;
		
		idStudent3 = 2;
		studentName3= "Lisa";
		career3="TICS";
		payment3= 5000.00;
		
		studentPayments.addStudentToList(idStudent,studentName,career,payment);
		
		studentPayments.addStudentToList(idStudent2,studentName2,career2,payment2);
		
		studentPayments.addStudentToList(idStudent3,studentName3,career3,payment3);

		
		studentPayments.showStudentList(studentList);
	}
}

