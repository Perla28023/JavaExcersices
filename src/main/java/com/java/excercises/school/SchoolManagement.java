package com.java.excercises.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {

	
	public static List <Student> studentList= new ArrayList<>();
	
	public void addStudentToList(Student student){
		studentList.add(student);
		System.out.println(student);
		
	}
	List<Student> showStudentList() {
	
	for(int i=0; i<studentList.size(); i++) {
		System.out.println(studentList.get(i));
	}
	return studentList;
	
	}
	
	public Student searchStudentId (int idStudent) {
		Student student = new Student();
		
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
			if(studentList.get(i).getIdStudent()==idStudent) {
				student = studentList.get(i);
			}else System.out.println("No corresponde al ID");
	}
		return student;
		
	}

public static void main (String[] args) {
	
	SchoolManagement schoolManagement = new SchoolManagement();
	Student studentObj1 = new Student(1, "Armando", "Sistemas", 3500);
	Student studentObj2 = new Student(2, "Mariana", "Sistemas", 1500);
	Student studentObj3 = new Student(3, "Perla", "Sistemas", 2500);
	
	Student studentSearch = new Student();
	
	schoolManagement.addStudentToList(studentObj1);
	schoolManagement.addStudentToList(studentObj2);
	schoolManagement.addStudentToList(studentObj3);
	
	schoolManagement.showStudentList();
	studentSearch=schoolManagement.searchStudentId(2);
	System.out.println("SE ECONTRO: "+ studentSearch);
	
}
}