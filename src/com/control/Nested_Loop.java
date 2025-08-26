package com.control;

public class Nested_Loop {

	public static void main(String[] args) {
		
//		for(int row = 1; row <4; row++) {
//			
//			for(int col= 1 ; col <=3; col++) {
//				System.out.println(row + " " + col);
//				
//			}
//		}
		
		for(int rows = 1; rows <=5 ; rows++) {
			for(int col= 1; col<=rows ; col++) {
				System.out.print("*");
			}
		
			System.out.println();
		}

	}

}

//row 1   col 1  col 2   col 3
//row 2   col 1  col 2   col 3
//row 3   col 1  col 2   col 3


//*      row 1 => 1 col  4 empty 
//**     row 2 => 2 col  3 empty
//***	 row 3 => 3 col  2 empty
//****	 row 4 => 4 col  1 empty
//*****  row 5 => 5 col  0 empty


//***** 
//****
//***
//**
//*


//*****
// ****
//  ***
//   **
//	  *

