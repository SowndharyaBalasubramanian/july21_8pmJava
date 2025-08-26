package com.methods;

import com.protectedModifier.Animal;

public class Protected_Child extends Animal {
	
	String colour = "Brown";
	public void Differntcat() {
		System.out.println("I am from differnt package protected child " + colour);
	}

	
//	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.animal();
//		
//		Protected_Child pc = new Protected_Child();
//		System.out.println(a.type = "cat");
//		
//	}

}
