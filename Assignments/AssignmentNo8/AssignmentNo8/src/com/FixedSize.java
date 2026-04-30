package com;

public class FixedSize implements Stack {
	
	Employee [] arr;
	int top;
	
	

	public FixedSize() {
		arr = new Employee[Stack_size];
		top =-1;
	}

	@Override
	public void push(Employee e) {
		if(top==arr.length-1) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top]=e;
		}
		
	}

	@Override
	public Employee pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			return arr[top--];
		}
	}

}
