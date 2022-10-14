
public class TestUnitArrayProblem {

	public int[] arrayPrint(int startValue, int endValue) {
		System.out.println("Even Numbers Array ...");
		int size = (endValue - startValue) + 1;
		int k = 0;
		int[] arrNum = new int[size];
		for (int i = startValue; i <= endValue; i++) {
			arrNum[k] = i;
			k++;
		}
		printDisplay(arrNum);
		System.out.println("-------------------------------------------------------------");
		return arrNum;
	}

	public int[] evenArray(int startNum, int endNum) {
		System.out.println("Even Numbers Array ...");
		int size = (endNum - startNum) / 2 + 1;
		int arrNum[] = new int[size];
		int temp = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 0) {
				arrNum[temp++] = i;
			}
		}
		printDisplay(arrNum);
		System.out.println("-------------------------------------------------------------");
		return arrNum;
	}

	public int[] oddArray(int startNum, int endNum) {
		System.out.println("Odd Numbers Array ...");
		int size = (endNum - startNum) / 2 + 1;
		int arrNum[] = new int[size];
		int temp = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 1) {
				arrNum[temp++] = i;
			}
		}
		printDisplay(arrNum);
		System.out.println("-------------------------------------------------------------");
		return arrNum;
	}

	public int[] duplicateRepeatation(int a[]) {
		System.out.println("Duplicate Repeatation ... ");
		int noDupArry[] = new int[(a.length)];
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
		int temp[] = zeroRemoval(noDupArry);
		printDisplay(temp);
		System.out.println("-------------------------------------------------------------");
		return temp;
	}

	public int[] multipleEleven(int startNum, int endNum) {
		System.out.println("Eleven Divisible Numbers ...");
		int size = (endNum - startNum) / 10 + 1;
		int arr[] = new int[size];
		int k = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 11 == 0) {
				arr[k++] = i;
			}
		}
		printDisplay(arr);
		System.out.println("-------------------------------------------------------------");
		return arr;
	}

	public int[] sortingAscNumber(int arr[]) {
		System.out.println("Ascending Order ...");
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
		System.out.println("-------------------------------------------------------------");
		return arr;
	}

	public int[] sortingDecNumber(int arr[]) {
		System.out.println("Descending Order ...");
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
		System.out.println("-------------------------------------------------------------");
		return arr;
	}

	public int[] mergeArray(int firstArray[], int secondArray[]) {
		System.out.println("Merge Array ...  ");
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
		int temp[] = zeroRemoval(dupArray);
		System.out.println("-------------------------------------------------------------");
		return temp;
	}

	public int[] consecutiveAddition(int arrayValue[]) {
		System.out.println("Consecutive Index Addition ... ");
		int b = arrayValue.length;
		int arrayTotal[] = new int[b - 1];
		int k = 0;
		for (int i = 0; i < arrayValue.length; i++) {
			for (int j = i + 1; j < arrayValue.length; j++) {
				arrayTotal[k++] = arrayValue[i++] + arrayValue[j];
			}
		}
		printDisplay(arrayTotal);
		System.out.println("-------------------------------------------------------------");
		return arrayTotal;
	}

	public int[] primeNumCheck(int startValue, int endValue) {
		System.out.println("Prime Numbers ... ");
		int k = 0;
		if (endValue <= 1) {
			System.out.println("Not prime");
		} else if (endValue >= 2) {
			int[] arr = new int[(endValue - startValue) / 2 + 1];
			for (int i = startValue; i <= endValue; i++) {
				if (checkprime(i)) {
					arr[k++] = i;
				}
			}
			int temp[] = zeroRemoval(arr);
			printDisplay(temp);
			System.out.println("-------------------------------------------------------------");
			return temp;
		}
		return null;
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

	public int indexOddEvenCalculation(int a[]) {
		System.out.println("Index Odd Even Calculation ...  ");
		int odd = 0, even = 0, finalResult;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				even += a[i];
			} else {
				odd += a[i];
			}
		}
		finalResult = odd - even;
		printDisplay2(finalResult);
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		return finalResult;
	}

	public int[] shuffleArray2(int arr[]) {
		System.out.println("Shuffle Array Odd Even ...");
		int arrTotal[] = new int[(arr.length)];
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
		System.out.println("-------------------------------------------------------------");
		return arrTotal;
	}

	public int[] shuffleArray(int arr[]) {
		System.out.println("Shuffle Array ...");
		int arrNew[] = new int[arr.length];
		int len = arr.length - 1;
		int k = 0;
		for (int i = 0; i < 5; i++) {
			arrNew[k++] = arr[i];
			arrNew[k++] = arr[len - i];
		}
		printDisplay(arrNew);
		System.out.println("-------------------------------------------------------------");
		return arrNew;
	}

	public void printDisplay(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public void printDisplay2(int a) {
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
