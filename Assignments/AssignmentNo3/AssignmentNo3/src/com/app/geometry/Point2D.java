package com.app.geometry;
import java.lang.Math;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x , double y) {
		this.x= x;
		this.y =y;
	}
	
	public  double  getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public String getDetails() {
		return (x+" "+ y);
	}
	public boolean isEqual(Point2D equal) {
		
		if(this.x==equal.x && this.y==equal.y ) {
			return true;
		}
		return false;
	}
	public double calculateDistance(Point2D other) {
		double diffX = other.x - this.x;   // (x2 - x1)
        double diffY = other.y - this.y;   // (y2 - y1)

        // distance = √( (x2-x1)² + (y2-y1)² )
        double distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));

        return distance;
	}
}
