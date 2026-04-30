package com.sunbeam;

public class Student {
	private String studentName;
	private int rollNo;
	private int age ;
	
	
	public Student() {
	}
	
	public Student(String studentName, int rollNo, int age) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll No "+ rollNo + "Student Name :" + studentName+ " Age:  "+age;
	}
	
	
	
}
