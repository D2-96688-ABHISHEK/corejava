package com.sunbeam.Q9;

import java.util.stream.Stream;

//9) Write a program to calculate sum of integers using streams.

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Stream.of(1,2,3,4,5,6,7,8,9,10)
		.reduce(0, (x,y) -> x + y);
		System.out.println("Sum of integer from 1 to 10 : " + result);
	}

}
