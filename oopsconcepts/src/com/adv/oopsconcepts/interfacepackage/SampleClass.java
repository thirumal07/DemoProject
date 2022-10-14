package com.adv.oopsconcepts.interfacepackage;

public class SampleClass implements InterfaceOne, InterfaceTwo {

	public String method1() {
		System.out.println("This is the Interface class 1 method : " + InterfaceTwo.age);
		return "Interface class 1 method";
	}

	public void method2() {
		System.out.println("This is the Interface class 2 method : " + InterfaceTwo.NAME);
	}

	@Override
	public String displayName(String name) {
		return InterfaceOne.super.displayName(name);
	}
}