package by.stech.les06.mass2x;

import java.util.Scanner;

public class TaskFrom21To30 {

	public static void main(String[] args) {
		// task21();
		// task22();
		// task24();
		// task25();
		// task26();
		// task27();
		// task28();
		// task29();
		task30();
	}

	public static void task21() { // 21

		int n = 10;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			for (int j = i; j >= 0; j--) {
				arr[i][j] = arr.length - c;
				c++;
			}
		}

		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

////////////////////////////////////////////////////////////////

	public static void task22() { // 22

		int n = 10;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			for (int j = arr.length - 1 - i; j >= 0; j--) {
				arr[i][j] = arr.length - c;
				c++;
			}
		}

		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

////////////////////////////////////////////////////////////		

	public static void task23() { // 23 Сформировать квадратную матрицу порядка N по правилу и подсчитать
									// количество положительных элементов в ней.
		int count = 0;
		int n = 10;
		double[][] arr = new double[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Math.sin((i * i - j * j) / n);
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}

		System.out.println(count);
		return;
	}

//////////////////////////////////////////////////////////////

	public static void task24() { // 24

		int n = 4;
		int[] ar = { 2, 2, 2, 2 };// by.stech.les05.mass.TaskFrom1To10.createInit(n);
		by.stech.les05.mass.TaskFrom1To10.printArr(ar);
		System.out.println();
		System.out.println();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.pow(ar[j], i + 1));
			}
		}

		TaskFrom1To10.printTwoDimaray(matrix);
		return;
	}

/////////////////////////////////////////////////////////////

	public static void task25() { // 25

		int n = 10;
		int[][] arr = new int[n][n];
		arr[0][0] = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i >= 1) {
				arr[i][0] = arr[i - 1][arr[i - 1].length - 1] + 1;
			}
			for (int j = 1; j < arr[i].length; j++) {

				arr[i][j] = arr[i][j - 1] + 1;

			}
		}

		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

///////////////////////////////////////////////////////////////

	public static void task26() { // 26 С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
									// массивом следующие действия: а) вычислить сумму отрицательных элементов в
									// каждой строке;

		int n = 3; // б) определить максимальный элемент в каждой строке;
		int[][] arr = new int[n][n]; // в) переставить местами максимальный и минимальный элементы матрицы.
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(">> ");
				arr[i][j] = sc.nextInt();
			}
		}
		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();
		int posIMax = 0;
		int posIMin = 0;
		int posJMin = 0;
		int posJMax = 0;
		int max;
		int min;
		min = max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int maxInString = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0) {
					sum += arr[i][j];
				}
				if (arr[i][j] > maxInString) {
					maxInString = arr[i][j];
				}
				if (arr[i][j] > max) {
					max = arr[i][j];
					posIMax = i;
					posJMax = j;
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
					posIMin = i;
					posJMin = j;
				}

			}
			System.out.println("Summ in " + (i + 1) + " string is " + sum);
			System.out.println("Max element in " + (i + 1) + " string is " + maxInString);
			System.out.println();

		}

		int temp = arr[posIMax][posJMax];
		arr[posIMax][posJMax] = arr[posIMin][posJMin];
		arr[posIMin][posJMin] = temp;

		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

/////////////////////////////////////////////////////////////////////////////////////////

	public static void task27() { // 27 В числовой матрице поменять местами два столбца любых столбца, т. е. все
									// элементы одного столбца поставить на
									// соответствующие им позиции другого, а его элементы второго переместить в
									// первый. Номера столбцов вводит
									// пользователь с клавиатуры.

		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array >> ");
		int n = sc.nextInt();

		int[][] arr = TaskFrom1To10.createTwoDimArr(n, n);
		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();

		System.out.print("Chenging columns >> ");
		int chengCol1 = sc.nextInt();
		int chengCol2 = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			temp = arr[i][chengCol1];
			arr[i][chengCol1] = arr[i][chengCol2];
			arr[i][chengCol2] = temp;

		}
		TaskFrom1To10.printTwoDimaray(arr);
		return;
	}

////////////////////////////////////////////////////////////////////////////////////////////		

	public static void task28() { // 28 Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
									// столбце. Определить, какой столбец
									// содержит максимальную сумму.

		int n = 5;
		int[][] arr = TaskFrom1To10.createTwoDimArr(n, n);
		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
			}
			System.out.println(sum);
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		System.out.println();
		System.out.println(maxSum);
		return;

	}

////////////////////////////////////////////////////////////////////////////////////////

	public static void task29() { // 29 Найти положительные элементы главной диагонали квадратной матрицы.

		int n = 5;
		int[][] arr = TaskFrom1To10.createTwoDimArr(n, n);
		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();
		int[] posElem = new int[n];
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j && arr[i][j] > 0) {
					posElem[p] = arr[i][j];
					p++;
				}

			}
		}
		by.stech.les05.mass.TaskFrom1To10.printArr(posElem);
		return;

	}

///////////////////////////////////////////////////////////////////////////////

	public static void task30() { // 30 Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
									// саму матрицу и номера строк, в
									// которых число 5 встречается три и более раз.

		int n = 10;
		int m = 20;

		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 15 + 1);
			}
		}

		TaskFrom1To10.printTwoDimaray(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int sn = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 5) {

					sn = i;
					count++;
				}
			}
			if (count >= 3) {
				System.out.println(sn);
			}
		}

		return;

	}

}
