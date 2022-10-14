package com.adv.oopsconcepts.polymorphism;

public class FirstClass {

	public void method1() {
		System.out.println(" parent class value method 1 ");
	}

	public int method1(int a) {
		int total = a;
		System.out.println("parent Classs value  method 1  : " + total);
		return total;
	}

	public int method1(int a, int b) {
		int total = a + b;
		System.out.println("parent Classs value  method 1  : " + total);
		return total;
	}

	public int method2(int a, int b) {
		int total = a + b;
		System.out.println("Super Class value :" + total);
		return total;
	}

}
