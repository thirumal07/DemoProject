package com.adv.oopsconcepts.singleinheritence;

public class ClassTwo extends ClassFirst {

	public String email;

	public ClassTwo() { 
		System.out.println("Class Two Default Constructor ... ");
	}
	
	public ClassTwo(String email) {
		String emailValue = email;
		System.out.println(emailValue);
		System.out.println("Parameterized Constructor .. ");
	}
//	public void method1() {
//
//		System.out.println("Method 1 - inside the Child Class ");
//		super.method2();
//		
//		System.out.println(super.age);
//		System.out.println(super.name);
//	}

	public void method2() {
		
//		super.method1();
//		this.method1();
//		System.out.println(this.height);
//		System.out.println(this.email );
//		System.out.println("Method 2 - Inside Parent Class");
	}
}
