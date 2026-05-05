package com.sunbeam.q1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the string : ");
			try {
				String str = sc.nextLine();
				if(str.length() > 80) {
					throw new ExceptionLineTooLong(str);
			}
		}catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}	
	}
}
