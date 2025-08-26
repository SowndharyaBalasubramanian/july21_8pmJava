package com.operations;

public class Bitwise {

	public static void main(String[] args) {
		byte a = 5;
		System.out.println(Integer.toBinaryString(a));
		
		int b = 4;
		System.out.println(b <<1);
		System.out.println(b << 2);
		System.out.println(b >> 1);
		System.out.println(b >> 2);
		
		int c = -4;
		System.out.println(c >> 1);
		System.out.println(c >> 2);
		System.out.println(c >>> 2);
		

	}

}
