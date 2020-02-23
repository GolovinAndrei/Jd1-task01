package by.stech.les06.mass2x;

import javax.sound.midi.Soundbank;

public class TaskFrom1To10 {

	public static void main(String[] args) {

		// task01();
		// task02();
		// task03();
		// task04();
		// task05();
		// task06();
		// task09();
		task10();
	}

	public static void task01() { // 1 Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
									// была ровно одна единица, и вывести на экран.

		int[][] array = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		printTwoDimaray(array);
		return;
	}

	public static void printTwoDimaray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		return;
	}

///////////////////////////////////////////////////////////////////////

	public static void task02() { // 2 Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
									// [0, 9].

		int[][] arr = createTwoDimArr(2, 3);
		printTwoDimaray(arr);
		return;

	}

	public static int[][] createTwoDimArr(int n, int m) {
		int[][] a = new int[n][m];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		return a;
	}

///////////////////////////////////////////////////////////////////////	

	public static void task03() { // 3 Дана матрица. Вывести на экран первый и последний столбцы.

		int[][] arr = createTwoDimArr(5, 5);
		printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j += arr[i].length - 1) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		return;

	}
/////////////////////////////////////////////////////////////////////////

	public static void task04() { // 4 Дана матрица. Вывести на экран первую и последнюю строки.

		int[][] arr = createTwoDimArr(5, 5);
		printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i += arr.length - 1) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		return;

	}

///////////////////////////////////////////////////////////////////////////	

	public static void task05() { // 5 Дана матрица. Вывести на экран все четные строки, то есть с четными
									// номерами.

		int[][] arr = createTwoDimArr(5, 5);
		printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i += 2) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		return;

	}

////////////////////////////////////////////////////////////////////////

	public static void task06() { // 6 Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
									// элемент больше последнего.

		int[][] arr = createTwoDimArr(6, 6);
		printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j += 2) {
				if (arr[0][j] > arr[arr.length - 1][j]) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		return;

	}

//////////////////////////////////////////////////////////////////////

	public static void task07() { // 7 Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
									// элементов.

		int[][] arr = createTwoDimArr(5, 5);
		printTwoDimaray(arr);
		System.out.println();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0 && arr[i][j] % 2 != 0) {
					sum += Math.abs(arr[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println(sum);
		return;

	}

////////////////////////////////////////////////////////////////////////		
	public static void task08() { // 8 Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
									// число 7 среди элементов массива.
		int[][] arr = createTwoDimArr(7, 5);

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 7) {
					count++;
				}
			}

		}
		System.out.println(count);
		return;

	}

/////////////////////////////////////////////////////////////////////	

	public static void task09() { // 9 Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int[][] arr = createTwoDimArr(5, 5);
		printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		return;
	}

///////////////////////////////////////////////////////////////////////	

	public static void task10() { // 10 Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		int k = 7;
		int p = 6;
		int[][] arr = createTwoDimArr(8, 8);
		printTwoDimaray(arr);
		System.out.println();

		printKSting(arr, k);
		System.out.println();
		System.out.println();
		printPColumn(arr, p);
		return;
	}

	public static void printKSting(int[][] a, int k) {

		for (int i = 0; i < a.length; i++) {
			if (i == k) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			}

		}
		return;
	}

	public static void printPColumn(int[][] a, int p) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == p) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();

		}

		return;
	}

}