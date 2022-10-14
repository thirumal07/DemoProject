package com.adv.oopsconcepts.encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.singleinheritence.DerivedClassEncap;

public class JUnitTestClass {

	SecondClass objTestUnit = new SecondClass();

	DerivedClassEncap objDerive = new DerivedClassEncap();

	@Test
	public void method2() {
		String actualResult = objDerive.method5("Thirumal");
		String expectedResult = "Thirumal";
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void method3() {
		int actualResult = objTestUnit.derivedSamePack(10, 15);
		int expectedResult = 150;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void method1() {
		float actualResult = objTestUnit.method1(2.3f, 4.5f);
		float expectResult = 6.8f;
		assertEquals(actualResult, expectResult);
	}

}
