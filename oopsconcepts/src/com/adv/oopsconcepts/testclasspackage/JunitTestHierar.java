package com.adv.oopsconcepts.testclasspackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.oopsconcepts.hierarcalInheritence.DomesticAnimal;
import com.adv.oopsconcepts.hierarcalInheritence.WildAnimals;

public class JunitTestHierar {

	WildAnimals objWild = new  WildAnimals();
	DomesticAnimal objDom = new DomesticAnimal();
	
	@Test
	public void testMethod1() {
		String actRes = objWild.wildAnimal();
		String expRes = "Wild Animals";
		assertEquals(actRes, expRes);
	}
	
	@Test
	public void testMethod2() {
		String actRes = objDom.domesticAnimal();
		String expRes = "Domestic Animals";
		assertEquals(actRes, expRes);
	}
}
