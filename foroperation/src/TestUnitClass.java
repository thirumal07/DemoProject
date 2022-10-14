import static org.junit.Assert.*;

import org.junit.Test;

public class TestUnitClass {

	TestUnitArrayProblem obArray = new TestUnitArrayProblem();

	@Test
	public void testquestion1() {
		int actualResult[] = obArray.arrayPrint(1, 5);
		int[] expectedResult = { 1, 2, 3, 4, 5 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion2() {
		int actualResult[] = obArray.evenArray(17, 28);
		int[] expectedResult = { 18, 20, 22, 24, 26, 28 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion3() {
		int actualResult[] = obArray.oddArray(1, 10);
		int[] expectedResult = { 1, 3, 5, 7, 9 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion4() {
		int actualResult[] = obArray.multipleEleven(21, 56);
		int[] expectedResult = { 22, 33, 44, 55 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion5() {
		int initialArray[] = { 1, 9, 5, 2, 3, 4, 7, 6 };
		int actualResult[] = obArray.sortingAscNumber(initialArray);
		int[] expectedResult = { 1, 2, 3, 4, 5, 6, 7, 9 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion6() {
		int initialArray[] = { 1, 9, 5, 2, 3, 4, 7, 6 };
		int actualResult[] = obArray.sortingDecNumber(initialArray);
		int[] expectedResult = { 9, 7, 6, 5, 4, 3, 2, 1 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion7() {
		int initialArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int actualResult[] = obArray.shuffleArray2(initialArray);
		int[] expectedResult = { 1, 3, 5, 7, 9, 10, 8, 6, 4, 2 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion8() {
		int initialArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int actualResult[] = obArray.shuffleArray(initialArray);
		int[] expectedResult = { 1, 10, 2, 9, 3, 8, 4, 7, 5, 6 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion9() {
		int initialArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int actualResult = obArray.indexOddEvenCalculation(initialArray);
		int expectedResult = 5;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion10() {
		int initialArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int actualResult[] = obArray.consecutiveAddition(initialArray);
		int[] expectedResult = { 3, 5, 7, 9, 11, 13, 15, 17, };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion11() {
		int initialArray[] = { 2, 5, 8, 2, 6, 7, 43, 3, 2, 9 };
		int actualResult[] = obArray.duplicateRepeatation(initialArray);
		int[] expectedResult = { 2, 5, 8, 6, 7, 43, 3, 9 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion12() {
		int actualResult[] = obArray.primeNumCheck(2, 10);
		int[] expectedResult = { 2, 3, 5, 7 };
		assertArrayEquals(actualResult, expectedResult);
	}

	@Test
	public void testquestion13() {
		int intialArray1[] = { 2, 5, 7, 9 };
		int intialArray2[] = { 2, 5, 8, 3 };
		int actualResult[] = obArray.mergeArray(intialArray1, intialArray2);
		int[] expectedResult = { 2, 5, 7, 9, 8, 3 };
		assertArrayEquals(actualResult, expectedResult);
	}

}
