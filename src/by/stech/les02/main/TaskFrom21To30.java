package by.stech.les02.main;

import java.util.Scanner;

public class TaskFrom21To30 {

	public static void main(String[] args) {
		// task21();
		// task23();
		// task26();
		// task27();
		// task28();
		task30();
	}

	public static void task21() { // 21 Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
									// девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
									// текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		System.out.print("Who are you: boy or girl? Enter B or G: ");
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		s = Character.toLowerCase(s);

		switch (s) {
		case 'b':
			System.out.print("I like boys!");
			break;
		case 'g':
			System.out.print("I like girls!");
			break;

		}
		return;
	}

///////////////////////////////////////////////////////////////////////////////

	public static void task22() { // 22 Перераспределить значения переменных х и у так, чтобы в х оказалось
									// большее из этих значений, а в y - меньшее.
		int x = 15;
		int y = 100;

		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

	}

//////////////////////////////////////////////////////////////////////////////	

	public static void task23() { // 23 Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
									// месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.

		System.out.print("Enter the date (month and day) in format: mm dd  ");
		Scanner sc = new Scanner(System.in);
		// int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("There isn't  month with that date!");
		}
		if (day < 1 || day > 31) {
			System.out.println("There isn't day with that date!");
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////////

	public static void task24() { // 23 Составить программу, определяющую результат гадания на ромашке — «любит—не
									// любит», взяв за исходное данное количество лепестков п.

		int n = 15;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("Loves!");
			} else {
				System.out.println("Doesn't love!");
			}
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////

	public static void task25() { // 25 Написать программу — модель анализа пожарного датчика в помещении, которая
									// выводит сообщение «Пожароопасная ситуация », если температура в комнате
									// превысила 60° С.
		double temp = 35.5;
		if (temp > 60.0) {
			System.out.println("Dangerous situation!!!");
		}
	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task26() { // 26 Написать программу нахождения суммы большего и меньшего из трех чисел.

		int x = 1;
		int y = 84;
		int z = 105;

		int max = x;
		if (y > max) {
			max = y;
		}
		if (z > max) {
			max = z;
		}

		int min = x;
		if (y < min) {
			min = y;
		}
		if (z < min) {
			min = z;
		}

		int sum = max + max;
		System.out.println(sum);
		return;

	}

/////////////////////////////////////////////////////////////////////////////////////////	

	public static void task27() { // 27 Найти max{min(a, b), min(c, d)}.

		int a = 25;
		int b = 3336;
		int c = 47;
		int d = -6;

		int res = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println(res);
		return;

	}

////////////////////////////////////////////////////////////////////////////////////////	

	public static void task28() { // 28 Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
									// равно d, то найти max(d — a, d — b, d —c).

		int a = 633;
		int b = 51;
		int c = 93;
		int d = 700;

		if (a != d) {
			int dif1 = d - a;
			if (b != d) {
				int dif2 = d - b;
				if (c != d) {
					int dif3 = d - c;
					int max = Math.max(Math.max(dif1, dif2), dif3);
					System.out.println("Maximum diffeence is " + max);
				} else {
					System.out.println("d=c");
				}
			}

			else {
				System.out.println("d=b");
			}

		}

		else {
			System.out.println("d=a");
		}
		return;
	}

////////////////////////////////////////////////////////////////////////////////////	

	public static void task29() { // 29 Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
									// расположены на одной прямой.
		int x1 = 23;
		int y1 = 10;
		int x2 = 2;
		int y2 = 8;
		int x3 = 71;
		int y3 = 36;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Three points on one line");
		} else {
			System.out.println("Points are not on one line");
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////////		

	public static void task30() { // 30 Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
									// заменить их абсолютными значениями, если это не так.

		double a = Math.random() * 201 - 100;
		double b = Math.random() * 201 - 100;
		double c = Math.random() * 201 - 100;

		if (a < b && b < c) {
			a *= 2;
			b *= 2;
			c *= 2;
			System.out.println(a + " " + b + " " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println(a + " " + b + " " + c);

		}

	}

}
