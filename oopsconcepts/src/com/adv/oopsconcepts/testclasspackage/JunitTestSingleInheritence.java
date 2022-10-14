package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.singleinheritence.DerivedClass;

public class JunitTestSingleInheritence {

	DerivedClass objDerivedClass = new DerivedClass();

	@Test
	public void testMethod1() {

		String actualResult = objDerivedClass.singleInheritMethod1();
		String expectedResult = "Parent class in single inheritance";
		assertEquals(actualResult, expectedResult);

	}

	@Test
	public void testMethod2() {
		int actResult = objDerivedClass.method1();
		int eptResult = 10;
		assertEquals(actResult, eptResult);
	}
}
