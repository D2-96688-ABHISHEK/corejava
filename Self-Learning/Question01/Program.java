package com.sunbeam.Q1;

//1) Implement a Student Information System with multiple constructors and demonstrate shallow vs deep copy.

public class Program {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		Student s2 =(Student) s1.clone(); // deep copy will happen as shallow copy clone() method is commented out
		System.out.println("S1 : " + s1.toString());
		System.out.println("S2 : " + s2.toString());
		
		Student s3 = new Student(1, "Suyash Jadhav", 100.0, new Date(21, 5, 2002));
		Student s4 = (Student) s3.clone(); // deep copy will happen as shallow copy clone() method is commented out
		System.out.println("S3 : " + s3.toString());
		System.out.println("S4 : " + s4.toString());
	}
}
