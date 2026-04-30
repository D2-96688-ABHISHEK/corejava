package com;

public class Circle {
	private int myX;
	private int myY;
	private double diameter;
	public Circle() {
		myX=0;
		myY=0;
		diameter=100;
	}
	public Circle(int myX, int myY,double diameter) {
		super();
		this.myX = myX;
		this.myY = myY;
		this.diameter= diameter;
	}
	public int getMyX() {
		return myX;
	}
	public void setMyX(int myX)  {
		
		this.myX = myX;
	}
	public int getMyY() {
		return myY;
	}
	public void setMyY(int myY){
		
		this.myY = myY;
	}
	public double getDiameter() {
		
		return diameter;
	}
	public void setDiameter(double diameter) throws DiameterIsNegativeException {
		if(diameter<0) {
			throw new DiameterIsNegativeException("Diameter can not be negative");
		}
		this.diameter = diameter;
	}
}
