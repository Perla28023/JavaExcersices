package com.java.excercises.school;

public class Student {

	public int idStudent;
	public String studentName;
	public String career;
	public double payment;
	
	public Student(int idStudent, String studentName, String career, double payment) {
		super();
		this.idStudent = idStudent;
		this.studentName = studentName;
		this.career = career;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", studentName=" + studentName + ", career=" + career + ", payment="
				+ payment + "]";
	}
	
	
}
