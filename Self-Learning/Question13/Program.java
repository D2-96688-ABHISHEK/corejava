package com.sunbeam.SelfLearningQ13;

import java.util.Comparator;

public class Program {
	
	
	
	public static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		class IntComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer x, Integer y) {
				return x - y;
			}
		}
		
		Integer[] arr = {200, 343, 24, 54, 32, 65, 665, 34};
		selectionSort(arr, new IntComparator());
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
