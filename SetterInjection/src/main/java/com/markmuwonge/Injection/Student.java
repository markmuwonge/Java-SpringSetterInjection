package com.markmuwonge.Injection;

public class Student {
	
	private String studentName;
	private int studentId;
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student name " + "'" + studentName + "'" + " has an ID of " + "'" + studentId + "'");
	}
	

}
