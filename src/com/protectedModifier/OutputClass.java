package com.protectedModifier;

import com.methods.Protected_Child;

public class OutputClass {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.animal();
	
	//same package
//		Cat c = new Cat();
//		c.type = "Cat";
//		c.cat();
		
		
		//different package
		Protected_Child pc = new Protected_Child();
		System.out.println(pc.type = "Black cat");
		pc.animal();
		pc.Differntcat();

	}

}
