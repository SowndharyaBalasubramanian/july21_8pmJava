package com.methods;

public class Method_Ex {

	public static void main(String[] args) {
		System.out.println("hi");
		double c = add(4.5,2.6);   //method call for first time
		System.out.println(c);
		System.out.println(add(1,5));//method call for second time
		
		Method_Ex obj = new Method_Ex();
		obj.display();
		
	}
	
	public static double add(double a , double b) {
		return a + b;
	}
	
	public static void print() {
		System.out.println("printed");
	}
	
	public void display() {
		System.out.println("displaying");
		print();
	}

}
