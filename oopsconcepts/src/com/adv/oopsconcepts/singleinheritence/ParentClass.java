package com.adv.oopsconcepts.singleinheritence;

public class ParentClass {

	public int age1=10;
	private int age;

	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String singleInheritMethod1() {
		System.out.println("Parent class in single inheritance");
		return "Parent class in single inheritance";
	}
}
