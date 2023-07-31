package com.cg.daythree;

public class constructorMain {
	public static void main(String[] args) {
		int id = 23;
		String name = "tamil";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();

	}
}
