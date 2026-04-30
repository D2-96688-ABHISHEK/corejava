package com.sunbeam;

public class Rectangle extends TwoDShape{
	double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    double area() {
        return length * width;
    }
}
