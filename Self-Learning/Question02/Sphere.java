package com.sunbeam.SelfLearningQ2;
import java.lang.Math;

public final class Sphere extends Shape3D {
	private double rad;
	
	public Sphere(double rad) {
		this.rad = rad;
	}
	
	@Override
	public final void calcArea() {
		double area = 4 * Math.PI * Math.pow(this.rad, 2);
		super.setArea(area);
	}
	
	@Override
	public final void calcVolume() {
		double volume = (4/3) * Math.PI * (Math.pow(this.rad, 3));
		super.setVolume(volume);
	}
}
