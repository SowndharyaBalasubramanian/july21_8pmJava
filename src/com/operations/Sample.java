package com.operations;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter num 1");
		int num1 = s.nextInt();
		
		System.out.println("enter num 2");
		int num2 = s.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1*num2);
		
		
		System.out.println("enter num 1");
		int num3 = s.nextInt();
		
		System.out.println("enter num 2 ");
		int num4 = s.nextInt();
		
		System.out.println(num2 - num4);
		
		s.close();
		
		

	}

}
