package com.adv.oopsconcepts.singleinheritence;


public class TestSingle {

	public static void main(String[] args) {
//		DerivedClass obj = new DerivedClass();
//		obj.sampleMethod();
//		ClassTwo objTwo = new ClassTwo();
//		 objTwo.method2();
//		int a=objTwo.getAge();
//		System.out.println(a);
		 
		ExClass objExClass = new ExClass();
		ExClass objExClass1 = new ExClass();
		ExClass objExClass2 = new ExClass();
		ExClass objExClass3 = new ExClass();
		ExClass objExClass4 = new ExClass();
//		 objExClass.name="Gilly";
		 System.out.println(objExClass.name);
		 System.out.println(objExClass1.name);
		 System.out.println(objExClass2.name);
		 System.out.println(objExClass3.name);
		 System.out.println(objExClass4.name);
	}

}
