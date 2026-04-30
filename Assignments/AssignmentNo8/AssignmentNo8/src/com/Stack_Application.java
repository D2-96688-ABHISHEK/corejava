package com;

import java.util.Scanner;

public class Stack_Application {
	public static void main(String[] args) {
		int choice;
		while((choice = menuList())!=0){
			
		}
		
	}
	public static int menuList() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Fixed Stack");
		System.out.println("2. Growable Stack");
		System.out.println("3. Push");
		System.out.println("4. Pop");
		System.out.println("Enter a choice");
		
		return sc.nextInt();
		
	}
}
