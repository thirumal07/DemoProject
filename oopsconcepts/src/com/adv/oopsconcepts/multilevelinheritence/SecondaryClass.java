package com.adv.oopsconcepts.multilevelinheritence;

public class SecondaryClass extends PrimaryClass {

	public int age = 25;

	public SecondaryClass() {
		System.out.println("Default Class of Secondary class");
//		m2();
//		m3();
	}

	public void m2() {

		System.out.println("secondary Class M2");
	}
}
