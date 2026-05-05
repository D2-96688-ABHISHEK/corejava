package com.sunbeam;

import java.util.Calendar;
import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		Calendar c = Calendar.getInstance();
		this.day = c.get(Calendar.DATE);
		this.month = c.get(Calendar.MONTH) + 1;
		this.year = c.get(Calendar.YEAR);
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// getters / inspectors
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	//setters / mutators
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date : " + this.day + " / " + this.month + " / " + this.year);
	}
}

class DateTest{
	Date d1 =  new Date(12, 3, 2026);
	
	public void acceptRecord() {
		System.out.println("Enter Date : ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Day : " );
		int day = sc.nextInt();
		d1.setDay(day);
		System.out.print("Month : " );
		int month = sc.nextInt();
		d1.setMonth(month);
		System.out.print("Year : " );
		int year = sc.nextInt();
		d1.setDay(year);
		sc.close();
	}
	
	public void printRecord() {
		System.out.println("Show Date Details : ");
		System.out.println("Day : " + d1.getDay());
		System.out.println("Month : " + d1.getMonth());
		System.out.println("Year : " + d1.getYear());
		d1.displayDate();
	}
}

public class Assi2Q3 {
	public static void main(String[] args) {
		DateTest dt = new DateTest();
		dt.acceptRecord();
		dt.printRecord();
	}
}
