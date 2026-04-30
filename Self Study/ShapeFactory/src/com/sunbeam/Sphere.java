package com.sunbeam;

public class Sphere extends ThreeDShape{
	double radius;
	
	 Sphere(double radius) {
	        this.radius = radius;
	 }
	
	 double area() {
	        return 4 * Math.PI * radius * radius;
	 }
	 
	 double volume() {
	        return (4.0/3) * Math.PI * radius * radius * radius;
	 }
	
	
	
}	
