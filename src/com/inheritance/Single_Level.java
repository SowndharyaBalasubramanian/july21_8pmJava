package com.inheritance;

public class Single_Level {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.display();
		v.ambition();
		
		
		Bike b = new Bike();
		b.tyres = 2;
		b.model = "Duke";
		b.show();
		b.display();
		b.ambition();
		
	}

}

class Vehicle{
	int tyres = 4;
	String model;
	
	public void display() {
		System.out.println("I am display from Parent class , The model of the vehicle from parent class is " + model + " " + tyres);
	}
	
	public void ambition() {
		System.out.println("doctor");
	}
}

class Bike extends Vehicle{
	int year = 2015;
	
	@Override
	public void ambition() {
		System.out.println("developer");
	}
	
	
	
	public void show() {
		System.out.println("The child class value " + year + " " + tyres + " " + model);
			
	}
	
	public void display() {
		System.out.println("I am display from child class");
	}
}