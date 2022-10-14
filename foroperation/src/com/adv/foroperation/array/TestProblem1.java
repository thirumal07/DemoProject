package com.adv.foroperation.array;

public class TestProblem1 {

	public static void main(String[] args) {
		int arr[] = { 10, 19, 3, 8, 70, 32, 46 };
		int result[] = new int[arr.length];
		int size = arr.length / 2;
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				result[i] = arr[i] + arr[i + 1];
				System.out.println(result[i]);

			} else if ((i + 1) <= size) {
				result[i] = arr[i + (i - 1)] + arr[i + (i + 1)];
				System.out.println(result[i]);

			} else if ((i + 1) <= size + 1) {
				result[i] = arr[i + (i - 1)] + arr[(i + (i + 1)) - (arr.length)];
				System.out.println(result[i]);

			} else {
				result[i] = arr[i + (i - 1) - arr.length] + arr[(i + (i + 1)) - (arr.length)];
				System.out.println(result[i]);

			}

		}

	}
}
