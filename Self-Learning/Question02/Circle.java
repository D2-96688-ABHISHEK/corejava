package com.sunbeam.SelfLearningQ2;
import java.lang.Math;

public final class Circle extends Shape2D {
	private double rad;
	
	public Circle(double rad) {
		this.setRad(rad);
	}

	public final double getRad() {
		return rad;
	}

	public final void setRad(double rad) {
		this.rad = rad;
	}
	
	@Override
	public final void calcArea() {
		double area = Math.PI * this.rad * this.rad;
		super.setArea(area);
	}
}
