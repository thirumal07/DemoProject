package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.interfacepackage.SampleClass;

public class JunitTestInterface {

	SampleClass objInterface = new SampleClass();

	@Test
	public void testMethod1() {
		String actRes = objInterface.method1();
		String expRes = "Interface class 1 method";
		assertEquals(actRes, expRes);
	}
	
	@Test
	public void testDisplayName() {
		String actRes = objInterface.displayName("Thirumal");
		String expRes = "Thirumal";
		assertEquals(actRes, expRes);
	}
}
