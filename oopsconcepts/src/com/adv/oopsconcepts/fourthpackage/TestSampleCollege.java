package com.adv.oopsconcepts.fourthpackage;

public class TestSampleCollege {

	public static void main(String[] args) {

		SampleCollege objClg = new SampleCollege();
//		String name = objClg.getClgPrincipalName();
//		System.out.println("Principal is ... : " + name);

		objClg.setClgPrincipalName(" Ricky Ponting");
		String name1 = objClg.getClgPrincipalName();
		System.out.println("Principal is ... : " + name1);

	}

}
