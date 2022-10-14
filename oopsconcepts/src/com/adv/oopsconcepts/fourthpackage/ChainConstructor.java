package com.adv.oopsconcepts.fourthpackage;

public class ChainConstructor {

	private String name;

	private int age;

	private String collegeName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public ChainConstructor() {
		
	}
	
	public ChainConstructor(int age) {
		this("thiru", "AVVM");
		this.age = age;
	}

	public ChainConstructor(String name, String clgName) {
		this.name=name;
		this.collegeName=clgName;
	}

}
