package com.app.fruits;

public class Apple extends Fruit{

	public Apple(String color, double weight, String name) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet and sour";
	}

}
