package com.abstraction;

public class AbstractClass_Example {

	public static void main(String[] args) {
		
		Animal a = new Rat();
		a.eat();
		a.sleep();
	}

}

abstract class Animal{
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	Animal(){
		
	}
}

class Rat extends Animal{
	public void eat() {
		System.out.println("Rat eats cheese");
	}
}