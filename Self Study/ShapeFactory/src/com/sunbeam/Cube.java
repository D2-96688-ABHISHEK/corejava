package com.sunbeam;

public class Cube extends ThreeDShape {
	double side;

    Cube(double side) {
        this.side = side;
    }

    double area() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}
