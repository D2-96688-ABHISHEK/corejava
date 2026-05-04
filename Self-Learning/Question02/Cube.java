package com.sunbeam.SelfLearningQ2;

public class Cube extends Shape3D{
	private double side;
	
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	public final void calcArea() {
		double area = 6 * this.side * this.side;
		super.setArea(area);
	}
	
	@Override
	public final void calcVolume() {
		double volume = this.side * this.side * this.side;
		super.setVolume(volume);
	}
}
