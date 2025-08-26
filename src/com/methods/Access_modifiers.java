package com.methods;

public class Access_modifiers {

	public static void main(String[] args) {
	display();
	
//	Example myObj = new Example();
//	myObj.show();
	
	Example.show();

	}
	
	public static void display() {
		System.out.println("displayed");
	}

}

class Example{
	
	
	public static void show() {
		System.out.println("Show method");
		
		Access_modifiers.display();

	}
}
