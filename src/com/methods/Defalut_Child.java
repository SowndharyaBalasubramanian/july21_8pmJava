package com.methods;

import com.defaultModifier.Parent;

public class Defalut_Child extends Parent {

	int acres = 4;
	
	public void display() {
		System.out.println("I am from differnt package child class " + acres);
	}
}
