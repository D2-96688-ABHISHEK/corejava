package com.sunbeam.q2;

import java.util.Scanner;

public class Circle {
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}

	public Circle(double myX, double myY, double myDiameter) {
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws DiameterNegativeException{
		if(myDiameter < 0) {
			throw new DiameterNegativeException();
		}
		this.myDiameter = myDiameter;
	}
	
	public void accessRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("X-coordinate of center : ");
		this.myX = sc.nextDouble();
		System.out.print("Y-coordinate of center : ");
		this.myY = sc.nextDouble();
		System.out.print("Diameter of Circle : ");
		Double diameter = sc.nextDouble();
		try {
			this.setMyDiameter(diameter);
		}catch(DiameterNegativeException e) {
			System.out.println("Exception : " + e.getMessage());
		}finally {
			sc.close();
		}
	}
}
