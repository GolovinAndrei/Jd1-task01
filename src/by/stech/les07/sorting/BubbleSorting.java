package by.stech.les07.sorting;

public class BubbleSorting {

	public static void main(String[] args) {

	
		int[] array = {5,25,87,54,41,22,14,56,3,63,66,28,31,20,10,17,58,94,2};
		bubbleSort (array);
		
		for (int k : array) {
			System.out.print(k + " ");

		}
	}


public static int[] bubbleSort (int[] array) {
	
	for (int i = 0; i < array.length; i++) {
		for (int j = (array.length - 1); j >= (i + 1); j--) {
			if (array[j] < array[j - 1]) {
				int temp = array[j];
				array[j] = array[j -1];
				array[j -1] = temp;
			}
		}

	}
	return array;
}
	
	
	
	
	
	
	
	
	
	
	
	

 









}
