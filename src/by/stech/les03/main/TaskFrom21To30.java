package by.stech.les03.main;

import java.util.Scanner;

import by.stech.les01.main.Task16;

public class TaskFrom21To30 {

	public static void main(String[] args) {
		// task21();
		// task24();
		// task26();
		// task27();
		// task28();
		// task29();
		task30();
	}

	public static void task21() { // 21 Составить программу для вычисления значений функции F(x) на отрезке [а, b]
									// с шагом h. Результат
									// представить в виде таблицы, первый столбец которой – значения аргумента,
									// второй - соответствующие значения функции:

		double func;
		double a = 1.0;
		double b = 45.0;
		double h = 5.0;

		for (double x = a; x <= b; x += h) {
			System.out.print("x= " + x + "   ");
			func = x - Math.sin(x);
			System.out.println("F(x)= " + func);
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////	

	public static void task22() { // 22

		double func;
		double a = 3.0;
		double b = 90.0;
		double h = 15.0;

		for (double x = a; x <= b; x += h) {
			System.out.print("x= " + x + "   ");
			func = Math.pow(Math.sin(x), 2);
			System.out.println("F(x)= " + func);
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////

	public static void task23() { // 23

		double func;
		double a = 30.0;
		double b = 60.50;
		double h = 0.5;

		for (double x = a; x <= b; x += h) {
			System.out.print("x= " + x + "   ");
			func = Math.atan(x / 3) + 0.5 * Math.sin(x);
			System.out.println("F(x)= " + func);
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////

	public static void task24() { // 24 Вводится натуральное число. Найти сумму четных цифр, входящих в его
									// состав. Преобразовать
									// его в другое число, цифры которого будут следовать в обратном порядке по
									// сравнению с введенным числом.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum = 0;
		int res = 0;
		int n = 1;

		while (res != number) {
			number -= res;
			res = (int) (number % Math.pow(10, n));
			int digit = (int) (res / Math.pow(10, n - 1));
			n++;
			System.out.print(digit);
			if (digit % 2 == 0) {
				sum += digit;
			}
		}
		System.out.println();
		System.out.println(sum);

		return;
	}

////////////////////////////////////////////////////////////////////////////////	

	public static void task25() { // 25 Требуется определить факториал числа, которое ввел пользователь.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println(fact);
		return;
	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task26() { // 26 Вывести на экран соответствий между символами и их численными
									// обозначениями в памяти компьютера

		for (int i = 32; i <= 126; i++) {
			char ch = (char) i;
			System.out.print(i + " ");
			System.out.println(ch);
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task27() { // 27 Для каждого натурального числа в промежутке от m до n вывести все
									// делители, кроме единицы и
									// самого числа. m и n вводятся с клавиатуры.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			System.out.print("Number" + i + " is devided: ");
			if (i % 2 == 0) {
				System.out.print("2 ");
			}
			if (i % 3 == 0) {
				System.out.print("3 ");
			}
			if (i % 5 == 0) {
				System.out.print("5 ");
			}
			if (i % 7 == 0) {
				System.out.print("7 ");
			}
			System.out.println();
		}

		return;

	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task28() { // 28

		Scanner sc = new Scanner(System.in);
		double z = 0;
		int stopNumber = 1;

		while (stopNumber != 0) {

			System.out.print("Enter the first number (X): ");
			double x = sc.nextDouble();

			System.out.print("Choose the opeator (+, -, *, /): ");
			char oper = (sc.next()).charAt(0);

			System.out.print("Enter the second number (Y): ");
			double y = sc.nextDouble();
			if (oper == '/' && y == 0) {
				System.out.println("Invalid value!");
				continue;
			}

			switch (oper) {

			case '+':
				z = x + y;
				break;
			case '-':
				z = x - y;
				break;
			case '*':
				z = x * y;
				break;

			case '/':
				z = x / y;
				break;

			}

			System.out.println("The esult of exprassion is: " + z);
			System.out.print("Do you want to continue? If YES - enter '1'. If you want to stop - enter '0': ");
			stopNumber = sc.nextInt();
		}

	}

///////////////////////////////////////////////////////////////////////////////////

	public static int inputNumb() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x = sc.nextInt();

		return (x);

	}

	public static void task29() { // 29 Даны два числа. Определить цифры, входящие в запись как первого так и
									// второго числа.

		int x = inputNumb();
		int y = inputNumb();

		int[] arOfX = Task16.digitOfNumber(x);
		int[] arOfY = Task16.digitOfNumber(y);

		for (int i : arOfX) {
			for (int j : arOfY) {

				if (i == j) {
					System.out.print(j + ", ");

				}
			}
		}

	}

/////////////////////////////////////////////////////////////////////////////////////

	public static void task30() { // 30 Написать программу, переводящую римские цифры в арабские.

		Scanner sc = new Scanner(System.in);
		String[] romeDigit = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		int[] arabDigit = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.print("Enter roman numeral: ");
		String d = sc.nextLine();

		for (int i = 0; i < romeDigit.length; i++) {
			if (romeDigit[i].equals(d.toUpperCase())) {
				System.out.println("Arabic numeral is: " + arabDigit[i]);
			}
		}

	}

}
