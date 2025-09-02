package com.arrays;

import java.util.Arrays;

public class Array_Intro {

	public static void main(String[]args) {
//		double marks [] = {88.25,60.50,70.75,99.00};
//		System.out.println(Arrays.toString(marks));
//		System.out.println("length : " + marks.length);
//		System.out.println(marks[2]);
//		marks[3] = 90.25;
//		System.out.println(Arrays.toString(marks));
//		marks[1] = 50;
//		System.out.println(Arrays.toString(marks));
		
		
		int mark[] = new int[6];
		mark[0] = 80;
		mark[1] = 78;
		mark[2] = 56;
		mark[3] = 67;
		mark[4] = 37;
		mark[5] = 100;
		System.out.println(Arrays.toString(mark));
		
		for(int i = 0 ; i < mark.length; i++) {
			System.out.println("The array value : " + i +  " "+ mark[i]);
		}
		
		for(int m : mark) {
			System.out.println(m);
		}
		
		
	}
}
