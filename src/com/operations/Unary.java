package com.operations;

public class Unary {

	public static void main(String[] args) {
		int a = 9;
		
		//post incre
//		System.out.println(a++); 
//		System.out.println(a);
		//9++   => 9+1 => 10 not , but 9
		
		
		//pre incre
		//System.out.println(++a);
		//1 + 9 => 10 = a
		
		int b = 8;
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		
		
		int c = 7;
		
		System.out.println(c);
		System.out.println(c--);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(c);
	}

}
