package com.sunbeam;

public class Circle extends TwoDShape{
	double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
