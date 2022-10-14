package com.adv.example.ex;

import java.util.Scanner;

public class ArithOperation {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The Any Two Numbers...");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		 sc.close();
		  addition a1 = new addition();
		  		a1.add(a, b);
		  subtract s1 = new subtract();
		  		s1.sub(a, b);
		  multi m1 = new multi();
		        m1.mul(a, b);
		  divi d1 = new divi();
		  		d1.div(a, b);
	}

}
