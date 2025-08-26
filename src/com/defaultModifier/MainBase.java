package com.defaultModifier;

public class MainBase {

	public static void main(String[] args) {
//		Parent P = new Parent();
//		P.show();
//		P.parent();
		
		Child c = new Child();
		
		c.job = "Developer";
		c.print();
		c.parent();

	}

}
