package by.stech.les07.sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		int []array = {4,5,6,33,28,4,25,86,74,14,21,20,10,11,55,32,37,16,37,49,83};
		insertionSort(array);
		
		for (int k : array) {
			System.out.print(k + " ");

		}
	}

public static int [] insertionSort (int[]array) {
	
	int key = 0;

	  for(int i = 1;i<array.length;i++){
	    key = array[i];
	   int j = i-1;
	    while(j>=0 && array[j]>key){
	      array[j+1] = array[j];
	      j = j-1;
	      array[j+1]=key;
	    }
	  }
	  
	  return array;
	}












}
