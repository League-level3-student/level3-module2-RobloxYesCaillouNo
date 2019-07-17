package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}

		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				return i;
			}

		}

		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = -1;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {

				tallest = peeps.get(i);

			}
		}

		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = "";

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}

		}

		return longestWord;
	}

	public static boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}

		return false;

	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub

		for (int i = 0; i < results.size(); i++) {
			for (int j = results.size() - 1; j > 0; j--) {
				if (results.get(j) < results.get(j - 1)) {
					double swap = results.get(j - 1);
					results.set(j - 1, results.get(j));
					results.set(j, swap);

				}
			}
		}

		return results;
	}

	public static String sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i < unsortedSequences.size(); i++) {
			
		}
		
		
		
		return null;
	}

}
