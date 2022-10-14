package com.adv.oopsconcepts.singleinheritence;

public class ClassFirst {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public ClassFirst() {
		this(23,"Thiru");
		System.out.println("default Constructor in parent class");
	}
	public ClassFirst(int age,String name) {
		System.out.println(this.age);
		System.out.println(name);
	}
	public String name = "thiru";

	public int height;

//	public void method1() {
//		
//		System.out.println("Method 1 - Inside Parent Class ");
//		System.out.println(this.age);
//		System.out.println(name);
//	}

	public void method2() {
		System.out.println("Method 2 - Inside Parent Class");
	}
}
