package by.stech.les04.branch;

import java.util.Random;
import java.util.Scanner;

import by.stech.les01.main.Task16;
import by.stech.les03.main.TaskFrom31To40;

public class TaskFrom11To20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// task11();
		// task12();
		// task13();
		// task15();
		// task16();
		// task17();
		// task18();
		// task19();
		task20();
	}

	public static void task11() { // 11 Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
									// D[4] + D[5]; D[4] +D[5] +D[6].
		int n = 10;
		Random rn = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rn.nextInt(100);
		}

		int sum;
		for (int j = 0; j < n; j += 3) {
			sum = sum3elem(arr, j);
			System.out.println("Summ from " + j + " to " + (j + 2) + ": " + sum);
		}
		return;
	}

	public static int sum3elem(int[] a, int k) {
		int sum = 0;
		for (int i = k; i <= k + 2; i++) {
			sum += a[i];
		}
		return sum;

	}

//////////////////////////////////////////////////////////////////////////////

	public static void task12() { // 12 Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
									// метод(методы) вычисления его площади,
									// если угол между сторонами длиной X и Y— прямой.
		int x = 10;
		int y = 24;
		int z = 18;
		int t = 30;

		double square = 0.5 * x * y + TaskFrom1To10.sqTreang(gip(x, y), z, t);
		System.out.println(square);

	}

	public static double gip(int a, int b) {

		double gip = Math.sqrt(a * a + b * b);

		return gip;

	}

///////////////////////////////////////////////////////////////////////////////

	public static void task13() { // 13 Дано натуральное число N. Написать метод(методы) для формирования массива,
									// элементами которого являются цифры числа N.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number >>");
		int numb = sc.nextInt();

		int[] arrayOfDigits = Task16.digitOfNumber(numb);

		for (int i = 0; i < arrayOfDigits.length; i++) {
			System.out.print(arrayOfDigits[i] + " ");
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////////

	public static void task14() { // 14 Написать метод(методы), определяющий, в каком из данных двух чисел больше
									// цифр.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number >>");
		int numb1 = sc.nextInt();
		System.out.print("Enter the second number >>");
		int numb2 = sc.nextInt();

		int[] ar1 = Task16.digitOfNumber(numb1);
		int[] ar2 = Task16.digitOfNumber(numb2);

		if (ar1.length > ar2.length) {
			System.out.println("First number hase more digits");
		} else {
			System.out.println("Second number hase more digits");
		}
		return;

	}

/////////////////////////////////////////////////////////////////////////////////////

	public static void task15() { // 15 натуральные числа К и N. Написать метод(методы) формирования массива А,
									// элементами которого
									// являются числа, сумма цифр которых равна К и которые не большее N.

	}

	public static int[] ar1(int k, int n, int number) {

		int[] tempArr = new int[n];
		int count = 0;

		int sum = TaskFrom31To40.sumOfDigits(Task16.digitOfNumber(number));
		for (int i = 0; i < n; i++) {
			if (number < n && sum == k) {
				tempArr[count] = i;
				count++;
			}
		}
		int[] resArr = new int[count];
		for (int i = 0; i < resArr.length; i++) {
			resArr[i] = tempArr[i];
		}
		return resArr;
	}

////////////////////////////////////////////////////////////////////////////////////////////	

	public static void task16() { // 16 Два простых числа называются «близнецами», если они отличаются друг от
									// друга на 2 (например, 41 и 43). Найти
									// и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное
									// натуральное число больше 2. Для решения
									// задачи использовать декомпозицию.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n>> ");
		int n = sc.nextInt();

		int[] array = init(n);
		pair(array);

		return;

	}

	public static int[] init(int n) {

		int[] a = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = n;
			n++;
		}
		return a;
	}

	public static void pair(int[] a) {
		int leng = a.length;
		if ((a.length - 1) % 3 == 0) {
			leng -= 1;
		}
		if ((a.length % 3 - 1) == 1) {
			leng -= 2;
		}
		for (int i = 0; i < leng; i += 3) {
			for (int j = i; j <= i + 2; j += 2) {
				System.out.print(a[j] + " ");
			}
			System.out.println();

		}
		return;

	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task17() { // 17Натуральное число, в записи которого n цифр, называется числом Армстронга,
									// если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
									// числа Армстронга от 1 до k. Для
									// решения задачи использовать декомпозицию.

		int k = 322;
		chekArmstrong(k);
		return;

	}

	public static void chekArmstrong(int k) {

		for (int i = 10; i <= k; i++) {
			int[] arOfDigits = Task16.digitOfNumber(i);
			int sum = TaskFrom31To40.sumOfDigits(arOfDigits);
			if (Math.pow(sum, arOfDigits.length) == i) {
				System.out.println("Amstromg number found!  " + i);
			}
		}
		return;

	}

//////////////////////////////////////////////////////////////////////////////////////	

	public static void task18() { // 18 Найти все натуральные n-значные числа, цифры в которых образуют строго
									// возрастающую последовательность
									// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

		int n = 4; // значность числа

		for (int i = (int) (Math.pow(10, n - 1)); i <= (int) (Math.pow(10, n) - 1); i++) {

			int[] arrTemp = Task16.digitOfNumber(i);
			int[] arrRes = rebuildArray(arrTemp);
			if (ascendCheck(arrRes)) {
				System.out.println("digits of a number form an increasing row - " + i);
			}

		}
		return;
	}

	public static int[] rebuildArray(int[] ar) {

		for (int i = 0; i < (ar.length / 2); i++) {
			int p;
			p = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = p;
		}
		return ar;
	}

	public static boolean ascendCheck(int[] a) {
		boolean s = false;
		for (int i = 1; i < a.length; i++) {

			if (a[i] <= a[i - 1]) {
				return s;
			}

		}
		s = true;
		return s;
	}

//////////////////////////////////////////////////////////////////////////////////////////////

	public static void task19() { // 19 Написать программу, определяющую сумму n - значных чисел, содержащих
									// только нечетные цифры. Определить
									// также, сколько четных цифр в найденной сумме. Для решения задачи использовать
									// декомпозицию.

		int n = 4; // значность числа
		int sum = 0;
		for (int i = (int) (Math.pow(10, n - 1)); i <= (int) (Math.pow(10, n) - 1); i++) {

			int[] arrTemp = Task16.digitOfNumber(i);
			int[] arrRes = rebuildArray(arrTemp);
			if (oddDigitsCheck(arrRes)) {
				sum += i;
			}

		}
		System.out.println("Summ is " + sum);
		int[] arrSum = Task16.digitOfNumber(sum);
		System.out.println("quantity of even digits is " + evenDigitsCount(arrSum));
		return;
	}

	public static boolean oddDigitsCheck(int[] a) {
		boolean s = false;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				return s;
			}

		}
		s = true;
		return s;
	}

	public static int evenDigitsCount(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

///////////////////////////////////////////////////////////////////////////////////////////

	public static void task20() { // 20 Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
									// его цифр и т.д. Сколько таких
									// действий надо произвести, чтобы получился нуль? Для решения задачи
									// использовать декомпозицию.
		int count = 0;
		int num = 75;

		do {
			num -= TaskFrom31To40.sumOfDigits(Task16.digitOfNumber(num));
			count++;
		} while (num != 0);

		System.out.println("Quantity of steps: " + count);

	}

}
