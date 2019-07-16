package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
	String[] linearray = {"value" , "words" };
	String[] linearray1 = {"hmmm","oof"};
	String[] linearray2 = {"ajio", "rip", "wait what", "ayy", "lmao", "google", "giga"};
	
		assertEquals(_00_LinearSearch.linearSearch(linearray, "value"), 0);
		assertEquals(_00_LinearSearch.linearSearch(linearray1, "oof"), 1);
		assertEquals(_00_LinearSearch.linearSearch(linearray2, "google"), 5);
		
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	int[] binaryArray = {1, 3 ,6, 33, 222, 1112, 5555, 5557, 11111};	
	int[] binaryArray1 = {1,3, 55, 94, 95, 100, 420, 666};	
	int[] binaryArray2 = {3, 9, 218, 452, 888, 8888, 10001};
	
		assertEquals(_01_BinarySearch.binarySearch(binaryArray, 0, binaryArray.length, 33), 3);
		assertEquals(_01_BinarySearch.binarySearch(binaryArray1, 0, binaryArray1.length, 666), 7);
		assertEquals(_01_BinarySearch.binarySearch(binaryArray2, 0, binaryArray2.length, 9), 1);
		
	
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	int[] interSearch = {1, 2, 3, 4, 5, 6, 7};
	int[] interSearch1 = {7, 14, 21, 28, 35, 42};
	
	
		assertEquals(_02_InterpolationSearch.interpolationSearch(interSearch, 5), 4);
		assertEquals(_02_InterpolationSearch.interpolationSearch(interSearch1, 7), 0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(interSearch1, 28), 3);
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] expoSearch = {1, 3 ,6, 33, 222, 1112, 5555, 5557, 11111};
		int[] expoSearch1 = {1,3, 55, 94, 95, 100, 420, 666};
		int[] expoSearch2 = {3, 9, 218, 452, 888, 8888, 10001};		
		
		assertEquals(_03_ExponentialSearch.exponentialSearch(expoSearch, 1), 0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(expoSearch1, 94), 3);
		assertEquals(_03_ExponentialSearch.exponentialSearch(expoSearch2, 888), 4);
		
	}
}
