package com.adv.oopsconcepts.encapsulation;

public class SecondClass extends FirstClass {

	public int method2(int a, int b) {
		System.out.println("This Derived class from first class");
		System.out.println(getName());
		System.out.println(email);
		System.out.println(age);
		System.out.println(regNo);
		int total = a + b;
		return total;
	}

	int derivedSamePack(int a, int b) {
//		 method3();
		int total = a * b;
		System.out.println("Default method derivedSamePack in base class");
		System.out.println("Total is " + total);
		return total;
	}
}
