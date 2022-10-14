package com.adv.oopsconcepts.multilevelinheritence;

public class PrimaryClass {

	public int age =23;

	public PrimaryClass() {
		this(12);
		System.out.println("Default Constructor");
	}

	public PrimaryClass(int a) {
		int age = a;
		System.out.println(age);
		m2();
		m3();
	}

	public void m2() {
		
		System.out.println("Primary Class M2");
	}

	private void m3() {
		System.out.println("Private Method in Primary Class");
	}
}
