package by.stech.les06.mass2x;

public class TaskFom11to20 {

	public static void main(String[] args) {
		// task11();
		// task12();
		// task13();
		// task14();
		// task15();
		// task16();
		// task17();
		// task18();
		// task19(10, 1, 0);
		task19(10, 0, 1); // 20-я задача
	}

	public static void task11() { // 11 Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
									// первая строка справа налево, вторая строка слева направо, третья строка
									// справа налево и так далее.

		int[][] arr = TaskFrom1To10.createTwoDimArr(5, 5);
		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][arr[i].length - j - 1] + " ");
				}
			}
			System.out.println();
		}
		return;
	}
/////////////////////////////////////////////////////////////////////

	public static void task12() { // 12
		int n = 10;
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == j && i < n - 1) {
					arr[i][j] = i;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

////////////////////////////////////////////////////////////////////////

	public static void task13() { // 13

		int n = 10;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = n - j;
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = j + 1;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;

	}

////////////////////////////////////////////////////////////////////////		

	public static void task14() { // 14

		int n = 10;
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == arr[i].length - 1 - j) {
					arr[i][j] = n - j;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

//////////////////////////////////////////////////////////////////////

	public static void task15() { // 15

		int n = 10;
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = n - j;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

//////////////////////////////////////////////////////////////////////////

	public static void task16() { // 16

		int n = 10;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = (i + 1) * (i + 2);
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task17() { // 17

		int n = 10;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

//////////////////////////////////////////////////////////////////	

	public static void task18() { // 18

		int n = 10;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j <= arr[i].length - i - 1) {
					arr[i][j] = 1 + i;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

/////////////////////////////////////////////////////////////////////		

	public static void task19(int n, int a, int b) { // 19,20

		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < arr.length / 2) {
					if (j >= i && j <= arr[i].length - i - 1) {
						arr[i][j] = a;
					} else {
						arr[i][j] = b;
					}
				} else {
					if (j <= i && j >= arr[i].length - i - 1) {
						arr[i][j] = a;
					} else {
						arr[i][j] = b;
					}
				}
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

}