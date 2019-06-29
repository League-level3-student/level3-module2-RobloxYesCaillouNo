package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int[] integers) {
		int lastNum = 0;

		for (int i = 0; i < integers.length; i++) {

			if (integers[i] < lastNum) {
				return false;

			}
			lastNum = integers[i];

		}
		return true;

	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] doubles) {
		double lastDec = 0.0;

		for (int i = 0; i < doubles.length; i++) {
			if (doubles[i] < lastDec) {
				return false;
			}
			lastDec = doubles[i];

		}
		return true;

	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean charArraySorted(char[] characters) {
		char lastChar = 'a';
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] < lastChar) {
				return false;
			}
		lastChar = characters[i];
		
		}
		return true;
		
	}
	
	
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] strings) {
		String lastString = "";
		
		for (int i = 0; i < strings.length; i++) {
			lastString.compareTo(strings[i]);
		lastString = strings[i];
		
		}
		return true;
		
	}
	
}
