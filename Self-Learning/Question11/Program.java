package com.sunbeam.SelfLearningQ11;

public class Program {
	public static <T extends Number> void printMinimum(T[] arr) {
		T min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i].doubleValue() < min.doubleValue()) {
				min = arr[i];
			}
		}
		System.out.println("The minimum in array is : " + min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 2, 3, 4, 5, 6 };
		printMinimum(arr);
		
		Double[] arr1 = {2.1 , 54.6, 65.3, 65.5, 32.5 };
		printMinimum(arr1);
		
		Number[] arr2 = {3, 54, 3,32.4, 54, 53, 2.5};
		printMinimum(arr2);
		
	}

}
