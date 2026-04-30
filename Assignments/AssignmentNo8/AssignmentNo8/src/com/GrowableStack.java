package com;

import java.util.Arrays;

public class GrowableStack implements Stack{
	
	Employee [] arr;
	int top;
	
	
	
	public GrowableStack() {
		arr = new Employee[Stack_size];
		top=-1;
	}

	@Override
	public void push(Employee e) {
		if(top==arr.length-1){
			arr= Arrays.copyOf(arr,arr.length*2);
		}
		arr[++top]=e;
	}

	@Override
	public Employee pop() {
		if(top!=-1) {
			return arr[top--];
		}
		else {
			System.out.println("Stack is empty");
		}
		return null;
	}	
}
