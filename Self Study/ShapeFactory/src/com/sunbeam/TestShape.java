package com.sunbeam;

public class TestShape {

	public static void main(String[] args) {
		 Shape c = new Circle(5);
	        Shape r = new Rectangle(4, 6);
	        Shape s = new Sphere(3);
	        Shape cu = new Cube(2);

	        System.out.println("Circle Area: " + c.area());
	        System.out.println("Rectangle Area: " + r.area());

	        System.out.println("Sphere Area: " + s.area());
	        System.out.println("Sphere Volume: " + s.volume());

	        System.out.println("Cube Area: " + cu.area());
	        System.out.println("Cube Volume: " + cu.volume());
	}

}
