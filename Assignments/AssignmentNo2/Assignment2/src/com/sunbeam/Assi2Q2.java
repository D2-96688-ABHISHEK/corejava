package com.sunbeam;

import java.util.Scanner;

//.Create a class called Employee that includes three instance variables—a 
//first name (type String), a last name (type String) and a monthly salary 
//(double). Provide a constructor that initializes the three instance variables. 
//Provide a set and a get method for each instance variable. If the monthly 
//salary is not positive, do not set its value. Write a test application named 
//EmployeeTest that demonstrates class Employee’s capabilities. Create two 
//Employee objects and display each object’s yearly salary. Then give each 
//Employee a 10% raise and display each Employee’s yearly salary again. 

class Employee{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setSalary(salary);
	}
	
	//getters 
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getYearlySalary() {
		return this.salary*12;
	}
	
	//setters
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	
	public void setSalary(double salary) {
		if(salary < 0) {
			System.out.println("Salary is negative so please Set appropriate salary. ");
			return;
		}
		this.salary = salary;
	}
	
	
}

class EmployeeTest{
	private Employee emp;
	
	public EmployeeTest(Employee emp) {
		this.emp = emp;
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.print("First Name : ");
		String fname = sc.next();
		emp.setFirstName(fname);
		System.out.print("Last Name : ");
		String lname = sc.next();
		emp.setLastName(lname);
		System.out.print("Salary : ");
		double salary = sc.nextInt();
		emp.setSalary(salary);
		sc.close();
	}
	
	public void printRecord() {
		System.out.println("First Name : " + emp.getFirstName());
		System.out.println("Last Name : " + emp.getLastName());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("YearlySalary : " + emp.getYearlySalary());
	}
	
	public double yearlySalary() {
		return emp.getYearlySalary();
	}
	
	public void raiseSalaryPercent(double percent) {
		double sal =  emp.getSalary();
		double newSal = (sal*0.1) + sal;
		emp.setSalary(newSal);
	}
}

public class Assi2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Suyash", "Jadhav", 10000);
		Employee e2 = new Employee("Anil", "Yadav", 20000);
		EmployeeTest et1 = new EmployeeTest(e1);
		EmployeeTest et2 = new EmployeeTest(e2);
		
		System.out.println("First Employee Record : ");
		et1.printRecord();
		System.out.println("\nSecond Employee Record : ");
		et2.printRecord();
		
		System.out.println("\nAfter 10% raise in salary");
		et1.raiseSalaryPercent(10);
		et2.raiseSalaryPercent(10);
		System.out.println("First Employee Record : ");
		et1.printRecord();
		System.out.println("\nSecond Employee Record : ");
		et2.printRecord();
		
		System.out.println("\nSetting salary of second emp to negative : ");
		e1.setSalary(-1);
	}

}
