package com.defaultModifier;

public class Parent {
	
	String job = "businessman";
	public int age = 50;
	
	public void show() {
		System.out.println("The age of the father is " + age + " the job is " + job);
	}
	
	void parent() {
		System.out.println("I am from default parent class");
	}
}
