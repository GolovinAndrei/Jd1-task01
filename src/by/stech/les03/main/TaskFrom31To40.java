package by.stech.les03.main;

import java.util.Random;

import java.util.Scanner;

import by.stech.les01.main.Task16;

public class TaskFrom31To40 {

	public static void main(String[] args) {
		// task31();
		// task32();
		// task33();
		// task34();
		// task36();
		// task37();
		// task38();
		task39();
	}

	public static void task31() { // 31 Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
									// Человек пытается их
									// угадать. Программа должна выводить угаданные и неугаданные числа из тех, что
									// сгенерировала
									// программа, а также ошибочные числа пользователя.

		int[] number = new int[5];
		Random rn = new Random();
		for (int i = 0; i < number.length; i++) {
			number[i] = rn.nextInt(15);
			System.out.print(number[i] + " ");
		}

		System.out.println("Try to guess 5 numbers from 1 to 15! You have 5 attemts. Enter them.");

		int[] guess = new int[5];
		for (int j = 0; j < number.length; j++) {
			guess[j] = TaskFrom21To30.inputNumb();
		}
		System.out.print("you guessed the following numbers: ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] == guess[i]) {
				System.out.println(number[i] + " ");

			}
		}
		System.out.println("you didn't guess the following numbers: ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] != guess[i]) {
				System.out.println(guess[i] + " ");

			}
		}
		return;
	}

//////////////////////////////////////////////////////////////////////

	public static void task32() { // 32 Проверить введенную пользователем строку на наличие недопустимых символов.
									// В качестве первого символа допустимы только буквы и знак подчеркивания.
									// Остальные символы могут быть буквами, цифрами и знаком подчеркивания.F

		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if (!Character.isLetter(str.charAt(0)) && !(str.charAt(0) == '_')) {
			System.out.println("invalid character entered in first position!");
			return;
		}
		for (int i = 1; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)) && !(str.charAt(i) == '_') && !Character.isDigit(str.charAt(i))) {
				System.out.println("invalid character entered!");
				break;
			}
		}
		return;
	}

//////////////////////////////////////////////////////////////////////////

	public static void task33() { // 33 Найдите наибольшую цифру данного натурального числа.

		int num = TaskFrom21To30.inputNumb();
		int[] ar = Task16.digitOfNumber(num);

		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}

		System.out.println(max);
		return;

	}

/////////////////////////////////////////////////////////////////////////	

	public static int sumOfDigits(int[] array) {
		int sum = 0;

		for (int i : array) {
			sum += i;
		}
		return (sum);

	}

	public static void task34() { // 34 Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

		for (int i = 1000; i < 9999; i++) {
			if (sumOfDigits(Task16.digitOfNumber(i)) == 15) {
				System.out.println(i + " ");
			}
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task35() { // 35 Найдите количество четных цифр данного натурального числа.

		int num = TaskFrom21To30.inputNumb();
		int[] ar = Task16.digitOfNumber(num);

		int n = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				n++;
			}
		}
		System.out.println(n);

	}

/////////////////////////////////////////////////////////////////////////////

	public static void task36() { // 36 Два двузначных числа, записанных одно за другим , образуют четырёхзначное
									// число, которое делится на их произведение. Найти эти числа.

		for (int i = 10; i <= 99; i++) {
			for (int j = 99; j >= 10; j--) {
				int num = i * 100 + j;
				if (num % (i * j) == 0) {
					System.out.println(num);
				}
			}

		}
		return;
	}

//////////////////////////////////////////////////////////////////////////

	public static void task37() { // 37

		for (int i = 10; i <= 99; i++) {
			for (int j = 99; j >= 10; j--) {
				int num1 = i * 100 + j;
				int num2 = j * 100 + i;
				if (num1 % 99 == 0 && num2 % 49 == 0) {
					System.out.println(i + " and " + j);
				}
			}

		}
		return;
	}

/////////////////////////////////////////////////////////////////////////	

	public static void task38() { // 38 Для заданного натурального числа определить, образуют ли его цифры
									// арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
									// Например: 1357, 963.

		int num = TaskFrom21To30.inputNumb();
		int[] ar = Task16.digitOfNumber(num);

		for (int i = 0; i < (ar.length / 2); i++) {
			int p;
			p = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = p;
		}
		int n = 0;
		for (int i = 1; i < ar.length - 1; i++) {
			if (ar[i] - ar[i - 1] == ar[i + 1] - ar[i]) {
				n++;
			}
		}
		if (n == ar.length - 2) {
			System.out.println("digits of the number increase arithmetically");
		} else {
			System.out.println("not arithmetic progression");
		}

		return;

	}

/////////////////////////////////////////////////////////////////////////////

	public static void task39() { // 39 В трехзначном числе зачеркнули старшую цифру. Когда полученное число
									// умножили на 7, то получили исходное число. Найти это число.

		for (int t = 100; t <= 999; t++) {

			int[] ar = Task16.digitOfNumber(t);

			for (int i = 0; i < (ar.length / 2); i++) {
				int p;
				p = ar[i];
				ar[i] = ar[ar.length - 1 - i];
				ar[ar.length - 1 - i] = p;
			}

			int max = ar[0];
			int n = 0;
			for (int j = 1; j < ar.length; j++) {
				if (ar[j] > max) {
					max = ar[j];
					n = j;
				}
			}
			int t1 = 0;
			switch (n) {
			case 0:
				t1 = ar[1] * 10 + ar[2];
				break;
			case 1:
				t1 = ar[0] * 10 + ar[2];
				break;
			case 2:
				t1 = ar[0] * 10 + ar[1];
				break;
			}
			if (t1 * 7 == t) {

				System.out.println(t);
				break;
			}
		}
		return;
	}
}