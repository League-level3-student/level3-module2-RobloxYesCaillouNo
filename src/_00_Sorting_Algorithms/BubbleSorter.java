package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	
	@Override
	void sort(int[] array, SortingVisualizer display) {
	
		
		int temp = array[0];
		
		boolean isSorted = false;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j] < array[j-1]) {
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
			display.updateDisplay();
			}
			else {
				isSorted = true;
			
			}
			
			}
		
		}
		
		
	}
	
}
