package com.adv.oopsconcepts.multilevelinheritence;

public class TestMultiLevel {
	
	public static void main(String[] args) {
//		ChildClass objChild = new ChildClass();
//		System.out.println(objChild.name);
//		System.out.println(objChild.age);
//		System.out.println(objChild.collegeName);
		
		PrimaryClass objFinalClass = new SecondaryClass();
		objFinalClass.m2();
		System.out.println(objFinalClass.age);
//		objFinalClass.m3();
	}

}
