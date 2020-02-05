package by.stech.les03.main;

import java.util.Scanner;

public class TaskFrom01To10 {

	public static void main(String[] args) {

	}

	public static void task01() { // 1 Необходимо вывести на экран числа от 1 до 5.

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		return;
	}

////////////////////////////////////////////////////////////////////

	public static void task02() { // 2 Необходимо вывести на экран числа от 5 до 1.

		for (int i = 5; i <= 1; i--) {
			System.out.println(i);
		}
		return;
	}

//////////////////////////////////////////////////////////////////////		
	public static void task03() { // 3 Необходимо вывести на экран таблицу умножения на 3:

		for (int i = 1; i <= 9; i++) {
			int mult = 3 * i;
			System.out.println(mult);
		}
		return;
	}
//////////////////////////////////////////////////////////////////////

	public static void task04() { // 4 С помощью оператора while напишите программу вывода всех четных чисел в
									// диапазоне от 2 до 100
									// включительно.

		int n = 2;
		while (n <= 100) {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
			n++;
		}

		return;
	}

/////////////////////////////////////////////////////////////////////////

	public static void task05() { // 5 С помощью оператора while напишите программу определения суммы всех
									// нечетных чисел в
									// диапазоне от 1 до 99 включительно.
		int sum = 0;
		int n = 1;

		while (n <= 99) {
			if (n % 2 != 0) {
				sum += n;
			}
			n++;
		}
		System.out.print(sum);
		return;
	}

//////////////////////////////////////////////////////////////////////////

	public static void task06() { // 6 Напишите программу, где пользователь вводит любое целое положительное
									// число. А программа
									// суммирует все числа от 1 до введенного пользователем числа.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter the number: ");
		int sum = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.print(sum);
		return;
	}

///////////////////////////////////////////////////////////////////////////

	public static void task07() { // 7 Вычислить значения функции на отрезке [а,b] c шагом h
		int func;
		int a = 6;
		int b = 21;
		int h = 3;

		for (int x = a; x <= b; x = x + h) {
			if (x <= 2) {
				func = -x;
			} else {
				func = x;
			}

		}
		return;
	}

///////////////////////////////////////////////////////////////////////////		

	public static void task08() { // 8 Вычислить значения функции на отрезке [а,b] c шагом h
		int func;
		int a = 28;
		int b = 122;
		int c = 31;
		int h = 8;

		for (int x = a; x <= b; x = x + h) {
			if (x == 15) {
				func = (x + c) * 2;
			} else {
				func = (x - c) + 6;
			}
		}
		return;
	}

///////////////////////////////////////////////////////////////////////////		

	public static void task09() { // 9 Найти сумму квадратов первых ста чисел.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int x = i * i;
			sum += x;
		}
		System.out.print(sum);
		return;
	}

/////////////////////////////////////////////////////////////////////////////		

	public static void task10() {		 // 10 Составить программу нахождения произведения квадратов первых двухсот чисел.
		double mult=1;
		for (int i = 1; i <= 200; i++) {
			int x = i * i;
			mult *= x;
		}
		System.out.print(mult);
		return;
	}

///////////////////////////////////////////////////////////////////////////
	

	



















}
