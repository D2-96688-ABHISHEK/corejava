package com.sunbeam.SelfLearningQ2;

public final class Rectangle extends Shape2D {
	private double length;
	private double breadth;
	
	public final double getLength() {
		return length;
	}
	public final void setLength(double length) {
		this.length = length;
	}
	public final double getBreadth() {
		return breadth;
	}
	public final void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public final void calcArea() {
		double area = this.length * this.breadth;
		super.setArea(area);
	}
}
