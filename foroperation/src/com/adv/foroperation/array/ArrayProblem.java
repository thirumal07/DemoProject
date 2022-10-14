package com.adv.foroperation.array;

public class ArrayProblem {

	public void arrayPrint(int n) {
		int[] arrNum = new int[n];
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
		}
		printDisplay(arrNum);
	}

	public void evenArray(int startNum, int endNum) {
		int size = (endNum - startNum) / 2 + 1;
		int arrNum[] = new int[size];
		int temp = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 0) {
				arrNum[temp++] = i;
			}
		}
		printDisplay(arrNum);
	}

	public void oddArray(int startNum, int endNum) {
		int size = (endNum - startNum) / 2 + 1;
		int arrNum[] = new int[size];
		int temp = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 1) {
				arrNum[temp++] = i;
			}
		}
		printDisplay(arrNum);
	}

	public void duplicateRepeatation() {
		int a[] = { 10, 12, 13, 15, 10, 12, 17, 12, 14, 18, 13, 14, 10, 13 };
		int noDupArry[] = new int[(a.length / 2)];
		int noCount[] = new int[a.length];
		int previousIndex = 0;
		int currentNo = 0;

		for (int i = 0; i < a.length; i++) {
			currentNo = a[i];
			boolean isPresent = false;
			int currentIndex = 0;
			for (int j = 0; j < noDupArry.length; j++) {
				if (currentNo == noDupArry[j]) {
					isPresent = true;
					currentIndex = j;
					break;
				}
			}
			if (isPresent) {
				noCount[currentIndex] = noCount[currentIndex] + 1;
			} else {
				noDupArry[previousIndex] = currentNo;
				noCount[previousIndex] = noCount[previousIndex] + 1;
				previousIndex++;
			}
		}
		for (int i = 0; i < noCount.length; i++) {
			if (noCount[i] > 1) {
			}
		}
		printDisplay(noDupArry);
	}

	public void multipleEleven(int startNum, int endNum) {
		int size = (endNum - startNum) / 10;
		int arr[] = new int[size];
		int k = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 11 == 0) {
				arr[k++] = i;
			}
		}
		printDisplay(arr);
	}

	public void sortingAscNumber() {
		int arr[] = { 1, 9, 5, 2, 3, 4, 7, 6 };
		System.out.println("Ascending Order ..");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printDisplay(arr);
	}

	public void sortingDecNumber() {
		int arr[] = { 1, 9, 5, 2, 3, 4, 7, 6 };
		System.out.println("Descending Order ..");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printDisplay(arr);
	}

	public void mergeArray() {
		int firstArray[] = { 1, 2, 3, 5, 6, 8 };
		int secondArray[] = { 2, 8, 6, 9, 11, 5, 4, 1 };
		int compare = firstArray.length + secondArray.length;
		int result[] = new int[compare];

		for (int i = 0; i < firstArray.length; i++) {
			result[i] = firstArray[i];
		}

		for (int j = 0; j < secondArray.length; j++) {

			result[firstArray.length + j] = secondArray[j];
		}
		int print = 0;
		int[] dupArray = new int[compare];
		for (int i = 0; i < result.length; i++) {
			int start = result[i];
			boolean isPresent = false;
			for (int f = 0; f < dupArray.length; f++) {
				if (start == dupArray[f]) {
					isPresent = true;
					break;
				}
			}
			if (isPresent == true) {
			} else {
				dupArray[print] = result[i];
				System.out.println(dupArray[print++]);
			}
		}

	}

	public void consecutiveAddition() {
		int arrayValue[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b = arrayValue.length;
		int arrayTotal[] = new int[b - 1];
		int k = 0;
		for (int i = 0; i < arrayValue.length; i++) {
			for (int j = i + 1; j < arrayValue.length; j++) {
				arrayTotal[k++] = arrayValue[i++] + arrayValue[j];
			}
		}
		printDisplay(arrayTotal);
	}

	public void primeNumCheck(int startValue, int endValue) {
		int k = 0;
		if (endValue <= 1) {
			System.out.println("prime");
		} else if (endValue >= 2) {
			int[] arr = new int[(endValue - startValue) / 3 + 1];
			for (int i = startValue; i < endValue; i++) {
				if (checkprime(i)) {
					arr[k++] = i;
				}
			}
			int temp[] = zeroRemoval(arr);
			printDisplay(temp);
		}
	}

	public boolean checkprime(int a) {
		if (a == 1 || a <= 0) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void indexOddEvenCalculation() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int odd = 0, even = 0, finalResult;
		System.out.println("Subtract both Odd and Even Idex :");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				even += a[i];
			} else {
				odd += a[i];
			}
		}
		finalResult = odd - even;
		printDisplay2(finalResult);
	}

	public void shuffleArray2() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrTotal[] = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arrTotal[k++] = arr[i];
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (i % 2 != 0) {
				arrTotal[k++] = arr[i];
			}
		}
		printDisplay(arrTotal);
	}

	public void shuffleArray() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrNew[] = new int[arr.length];
		int len = arr.length - 1;
		int k = 0;
		for (int i = 0; i < 5; i++) {
			arrNew[k++] = arr[i];
			arrNew[k] = arr[len - i];
			k++;
		}
		printDisplay(arrNew);
	}

	public int[] printDuplicate() {
		int[] a = { 10, 12, 13, 15, 10, 12, 17, 12, 14, 18, 13, 14, 10, 13 };
		int k = 0, x = 0;
		int[] countArr = new int[a.length];
		int[] duplicateArr = new int[a.length];
		int[] finalArr = new int[countArr.length];
		for (int i = 0; i < a.length; i++) {
			boolean match = false;
			for (int j = 0; j < duplicateArr.length; j++) {
				if (a[i] == duplicateArr[j]) {
					match = true;
					break;
				}
			}
			if (!match) {
				int count = 1;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count = count + 1;
					}
				}
				countArr[k] = count;
				duplicateArr[k] = a[i];
				k++;
			}
		}
		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] > 1) {
				finalArr[x] = duplicateArr[i];
				x++;
			}
		}
		for (int m = 0; m < finalArr.length; m++) {
			System.out.println(finalArr[m]);
		}
		return finalArr;
	}

	private void printDisplay(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
//		System.out.println();
	}

	private void printDisplay2(int a) {
		System.out.print(a + " ");
	}

	public int[] zeroRemoval(int includeZero[]) {
		int len = 0;
		for (int i = 0; i < includeZero.length; i++) {
			if (includeZero[i] != 0) {
				len++;
			}
		}
		int noZero[] = new int[len];
		for (int i = 0; i < noZero.length; i++) {
			if (includeZero[i] != 0) {
				noZero[i] = includeZero[i];
			}
		}
		return noZero;
	}
}
