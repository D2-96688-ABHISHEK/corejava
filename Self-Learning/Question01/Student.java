package com.sunbeam.Q1;

//1) Implement a Student Information System with multiple constructors and demonstrate shallow vs deep copy.

public class Student implements Cloneable {
	private int roll;
	private String name;
	private	double marks;
	private Date birth;
	
	public Student() {
		this.roll = 0;
		this.name = "No name";
		this.marks = 0.0;
		this.birth = new Date();
	}

	public Student(int roll, String name, double marks, Date birth) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", birth=" + birth + "]";
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {  // shallow copy
//		Student temp = (Student) super.clone();
//		return temp; // temp points to  the same date object as as the calling reference
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student temp = (Student) super.clone();
		temp.birth = (Date) this.birth.clone();
		return temp;
	}
	
	

}
