package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.polymorphism.FirstClass;
import com.adv.oopsconcepts.polymorphism.SecondClass;

public class JunitTestOverLoad {

	SecondClass objSecond = new SecondClass();

	FirstClass objFirst = new SecondClass();

	@Test
	public void testMethod1() {
		int actRes = objSecond.method1(2, 3);
		int expRes = 5;
		assertEquals(actRes, expRes);
	}

	@Test
	public void testMethod2() {
		int actRes = objSecond.method3(2, 3);
		int expRes = 6;
		assertEquals(actRes, expRes);
	}

	@Test
	public void testMethod3() {
		int actRes = objFirst.method2(3, 4);
		int expRes = -1;
		assertEquals(actRes, expRes);
	}
}
