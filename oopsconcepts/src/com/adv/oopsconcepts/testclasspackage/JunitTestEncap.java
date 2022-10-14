package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adv.oopsconcepts.encapsulation.FirstClass;
import com.adv.oopsconcepts.encapsulation.SecondClass;

public class JunitTestEncap extends FirstClass {

	SecondClass obEncap = new SecondClass();
	
//	@Test
//	public void Method1() {
//		
//		int actualResult = obEncap.method2(10, 20);
//		int expectedResult = 30;
//		assertEquals(actualResult, expectedResult);
//	}
	
	@Test
	public void name() {
		JunitTestEncap obTestclass = new JunitTestEncap();
		obTestclass.method5("");
		String actualResult = obTestclass.method5("Thirumal");
		String expectedResult = "Thirumal";
		assertEquals(expectedResult, actualResult);
	}

}
