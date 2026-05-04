package com.sunbeam.SelfLearningQ2;

//2) Create a Shape hierarchy (Shape → 2DShape/3DShape →Circle/Rectangle/Sphere/Cube) with area and 
//volume calculations 

public class Program {
	public static void main(String[] args) {
		Circle circle = new Circle(12.3);
		System.out.println("Circle : ");
		circle.calcArea();
		circle.printArea();
		
		System.out.println("===============================");
		
		Rectangle rectangle = new Rectangle(40.0, 30.0);
		System.out.println("Rectangle : ");
		rectangle.calcArea();
		rectangle.printArea();
		
		System.out.println("===============================");
		
		Cube cube = new Cube(20.0);
		System.out.println("Cube : ");
		cube.calcArea();
		cube.printArea();
		cube.calcVolume();
		cube.printVolume();
		
		System.out.println("===============================");
		
		Sphere sphere = new Sphere(20.0);
		System.out.println("Sphere : ");
		sphere.calcArea();
		sphere.printArea();
		sphere.calcVolume();
		sphere.printVolume();
		
		System.out.println("===============================");
	}

	
}
