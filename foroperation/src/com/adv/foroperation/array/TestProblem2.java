package com.adv.foroperation.array;

public class TestProblem2 {

	public static void main(String[] args) {
		int initArray[] = { 10, 19, 3, 8, 70, 32, 46 };
		int resultArr[] = new int[initArray.length];
		int size = initArray.length /2;
		for (int i = 0; i < initArray.length; i++) {
			if (i == 0) {
				resultArr[0] = initArray[i - 1] + initArray[i + 1];
			} else if ((i + 1) <= size) {
				resultArr[i] = initArray[i + (i - 1)] + initArray[i + (i + 1)];
			}
			for (int j = 0; j < resultArr.length; j++) {
				System.out.println(resultArr[j]);
			} 
		}
	}

}
