package com.adv.oopsconcepts.interfacepackage;

public interface InterfaceOne {

	public final static int age = 10;

	public final static String NAME = "Thirumal";

	public String method1();

	public static String sampleMethod() {
		System.out.println("Sample Method in Interface One ..");
		return "Thiru";
	}

	public default String displayName(String name) {
		System.out.println("Interface one Method " + name);
		return name;
	}
}
