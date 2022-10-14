package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.multilevelinheritence.ChildClass;

public class JunitTestMultiLevel {

	ChildClass objChild = new ChildClass();

	@Test
	public void testMethod1() {
		String actRes = objChild.method2();
		String expRes = "Grand Parent Class ";
		assertEquals(actRes, expRes);
	}

	@Test
	public void testMethod2() {
		String actRes = objChild.method1();
		String expRes = " Parent Class ";
		assertEquals(actRes, expRes);
	}

	@Test
	public void testMethod3() {
		String actRes = objChild.method3();
		String expRes = "child Class ";
		assertEquals(actRes, expRes);
	}
}
