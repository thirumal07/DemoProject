package com.adv.oopsconcepts.encapsulation;

//import MultiLevelInheritence.GrandParentClass;

public class FirstClass /* extends GrandParentClass */ {

	private String name = "Thiru";

	String email = "thiru@gmail.com";

	protected int regNo = 975984;

	public int age = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float method1(float a, float b) {
//		SecondClass secondClass = new SecondClass();
//		obj.method2();
//		method4();
		System.out.println("This is the Base class");
		float totalValue = a + b;
		System.out.println("Total is " + totalValue);
//		System.out.println(getName());
//		System.out.println(email);
//		System.out.println(age);
//		System.out.println(regNo);
		return totalValue;
	}

//	private void method3() {
//		System.out.println("Private method calling inside the class");
//	}

	int method4(int a, int b) {
//		 method3();
		int total = a * b;
		System.out.println("Default method in base class");
		System.out.println("Total is " + total);
		return total;
	}

	protected String method5(String name) {
		String nameValue = name;
		System.out.println("Protected Method in First Class " + nameValue);
		return nameValue;
	}
}
