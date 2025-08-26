package com.control;

public class Decision {

	public static void main(String[] args) {
		
		//int marks = 45;
//		if(marks >= 35) {
//			System.out.println("Pass mark");
//		}else {
//			System.out.println("Fail mark");
//		}
		
		
		//if else ladder
		
//		if(marks >= 90 && marks <=100) {
//			System.out.println("Grade A");
//		}else if(marks >= 80 && marks <90) {
//			System.out.println("Grade B");
//		}else if(marks >= 70 && marks <80) {
//			System.out.println("Grade C");
//		}else if(marks >= 50 && marks <70) {
//			System.out.println("Grade D");
//		}else if(marks >= 35 && marks <50) {
//			System.out.println("Grade E");
//		}else {
//			System.out.println("Fail mark");
//		}
		
		
		int age = 16;
		
		if(age >= 18) {
			System.out.println("eligible to vote");
			
			if(age >50) {
				System.out.println("eligible to vote and senior citizen");
			}
			else {
				System.out.println("eligible to vote but not a senior citizen");
			}
		}
		
		else {
			System.out.println("not eligible to vote");
		}
		
	}

}

//(ticket price is 72)
//men

//men > 50 => 5% discount  
//men 30 to 50  => 3 % discount
//men 15 to 29 => 2.5 % discount
//remaining men = > 6 % discount

//women

//women > 50 => 6.6% discount  
//women 30 to 50  => 4 % discount
//women 15 to 29 => 3.5 % discount
//remaining women = > 6.5 % discount



