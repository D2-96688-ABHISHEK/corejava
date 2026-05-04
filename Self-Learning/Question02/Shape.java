package com.sunbeam.SelfLearningQ2;

public abstract class Shape {
	private double area;
	private double volume;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	};
}

abstract class Shape2D extends Shape {

	public final void printArea() {
		System.out.printf("Area : %.2f square unit\n", super.getArea());
	}
	
	public abstract void calcArea();
}

abstract class Shape3D extends Shape {
	
	public final void printArea() {
		System.out.printf("Area : %.2f square unit\n", super.getArea());
	}
	
	public final void printVolume() {
		System.out.printf("Volume : %.2f cubic unit\n",super.getVolume());
	}
	
	public  abstract void calcArea();
	public abstract void calcVolume();
}