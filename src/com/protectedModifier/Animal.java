package com.protectedModifier;

public class Animal {

	int legs = 4;
	protected static String type = "Animal";
	
	public void animal() {
		System.out.println("Default parent class " + legs + " " + type);
	}
}
