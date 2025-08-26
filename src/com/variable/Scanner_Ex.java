package com.variable;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the number 1");
//		int num1 = scan.nextInt();
//		
//		System.out.println("Enter the number 2");
//		int num2 = scan.nextInt();
//		
//		System.out.println(num1 + num2);
//		
//		scan.close();
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the name");
//		
//		String name = s.nextLine();
//		System.out.println(name);
		
		
	    System.out.println("Enter the name");
		
		String names = s.next();
		System.out.println(names);
		
		s.close();
		
		

	}

}
