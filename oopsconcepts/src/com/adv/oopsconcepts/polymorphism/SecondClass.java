package com.adv.oopsconcepts.polymorphism;

public class SecondClass extends FirstClass {

	public int method3(int a) {
		System.out.println("Child Class value overriden");
		return a;
	}

	public  int method3(int a, int b) {
		int total = a * b;
		System.out.println("Child Classs value : " +total);
		return total;
	}

	public int method2(int a, int b) {
		int total = a - b;
		System.out.println("Sub Class value Overriden :" + total);
		return total;
	}
}
