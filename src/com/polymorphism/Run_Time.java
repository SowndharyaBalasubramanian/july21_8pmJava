package com.polymorphism;

public class Run_Time {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		
		Animal d ;
		
		d= new Dog();
		d.sound();
		
		
		Animal c = new Cat();
		c.sound();
	}

}

class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("CAt meows");
	}
}
