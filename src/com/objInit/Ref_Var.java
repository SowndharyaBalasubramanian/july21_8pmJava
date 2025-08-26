package com.objInit;

public class Ref_Var {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.year = 2022;
		c1.colour = "Black";
		
		c1.disply();

	}

}

class Car{
	
	String colour;
	int year;
	
	public void disply() {
		System.out.println(colour + " " + year);
	}
}
