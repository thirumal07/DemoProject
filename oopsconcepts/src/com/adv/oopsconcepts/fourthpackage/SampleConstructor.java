package com.adv.oopsconcepts.fourthpackage;

public class SampleConstructor {

	private int num1;

	private int num2;

	private int num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public SampleConstructor() {
		this(10);
		System.out.println("This is a Default Constructor ...");
	}

	public SampleConstructor(int num1) {
		this(20, 30);
		System.out.println("This is Single Parameter Constructot called .. " + num1);
	}

	public SampleConstructor(int num1, int num2) {
		this(5, 10, 20);
		int total = num1 + num2;
		System.out.println("This is Two Parameterized Constructor called .." + total);
	}

	public SampleConstructor(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		System.out.println("This is Three Parameterized Constructor called .." + total);
	}

	public void m1() {	
		System.out.println("Sample Method Calling");
	}
}
