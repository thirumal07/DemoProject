package com.adv.oopsconcepts.interfacepackage;

public interface InterfaceTwo {

	public String NAME = "Thiru";

	public final static int age = 20;

	public void method2();

	public static String sampleMethod() {
		System.out.println("Sample Method in Interface Two ..");
		return "Thiru";
	}

	public default String displayName(String name) {
		System.out.println("Interface Two Method " + name);
		return name;
	}
}
