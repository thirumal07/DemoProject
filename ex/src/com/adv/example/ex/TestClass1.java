package com.adv.example.ex;

import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Any Four Numbers...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		Addition1 a1 = new Addition1();
		int x = a1.add(a, b);

 		Subtraction1 s1 = new Subtraction1();
		int y = s1.sub(c, d);

		Multiply1 m1 = new Multiply1();
		int result = m1.mul(x, y);

		PrintValue p1 = new PrintValue();
		p1.printVal(result);
	}
}
