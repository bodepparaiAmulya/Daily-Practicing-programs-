package com.seleniumexpress;

public class Student {
	String studentName;
	public void displayStudentInfo()
	{
		
		System.out.println("Student name is :" + studentName);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
