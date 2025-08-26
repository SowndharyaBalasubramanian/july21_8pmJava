package com.objInit;

public class Constructors {

	public static void main(String[] args) {
		Cars c1 = new Cars("Red", 2025);
		
	
		c1.disply();
	}

}


class Cars{
	
	String colour;
	int year;
	
	Cars(String colour, int yr){
		this.colour = colour;
		this.year = yr;
	}
	
	public void disply() {
		System.out.println(colour + " " + year);
	}
}
