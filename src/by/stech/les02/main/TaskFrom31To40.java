package by.stech.les02.main;

import java.util.Scanner;

public class TaskFrom31To40 {

	public static void main(String[] args) {
		// task31();
		// task32();
		// task33();
		// task34();
		// task35();
		task36();
	}

	public static void task31() { // 31 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
									// Определить, пройдет ли кирпич через отверстие.
		int A = 100;
		int B = 60;
		int x = 120;
		int y = 50;
		int z = 90;

		if (x < A && y < B || x < B && y < A) {
			System.out.println("success!");

		} else if (y < A && z < B || z < A && y < B) {
			System.out.println("success!");

		} else if (x < A && z < B || z < A && x < B) {
			System.out.println("success!");

		} else {
			System.out.println("The hole is too small");
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task32() { // 32 Написать программу, которая по заданным трем числам определяет, является
									// ли сумма каких-либо двух из них положительной.

		double a = Math.random() * 201 - 100;
		double b = Math.random() * 201 - 100;
		double c = Math.random() * 201 - 100;

		if (a + b > 0 || a + c > 0 || b + c > 0) {
			System.out.println("There is positiv sum");

		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task33() { // 33 Написать программу, которая по паролю будет определять уровень доступа
		// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		// шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		// пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		// модули баз В, С; 9455, 8997 — доступен модуль базы С.

		Scanner sc = new Scanner(System.in);
		System.out.println("Please? enter the password: ");
		int pass = sc.nextInt();

		if (pass == 9583 || pass == 1747) {
			System.out.println("You have access to a complete database!");

		}

		if (pass == 3331 || pass == 7922) {
			System.out.println("You have access to databases A and B");
		}

		if (pass == 9455 || pass == 8997) {
			System.out.println("You have access to databases C only");
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////////	

	public static void task34() { // 34 Составить программу, реализующую эпизод применения компьютера в книжном
									// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
									// покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
									// денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
									// указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
									// и указывает размер недостающей суммы.

		double price = 0.00;
		Scanner sc = new Scanner(System.in);
		String[] bookArray = { "war and peace", "harry potter", "1911" };
		double[] priceArray = { 25.20, 48.70, 37.30 };

		System.out.print("Plaese, enter the name of the book: ");
		String name = (sc.nextLine()).toLowerCase();

		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].equals(name)) {
				price = priceArray[i];
			}
		}
		if (price == 0) {
			System.out.print("There isn't such book!");
			return;
		}

		System.out.print("Amount deposited: ");
		double amountSum = sc.nextDouble();

		if (amountSum == price) {
			System.out.print("Thank you!");
		} else if (amountSum > price) {
			double rest = amountSum - price;
			System.out.print("Take a rest: " + rest);
		} else {
			double dif = price - amountSum;
			System.out.print("You have to add " + dif);
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void task35() { // 35 Вычислить число и месяц в невисокосном году по номеру дня??

		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		if (day > 365) {
			day = day % 365;
		}
		int n=1;
		while (day>31 ){
		if (n%2==0) {
			day-=30;
		}
			else {
				day-=31;
			}
		}
		
			
		//System.out.print(n);

	}

/////////////////////////////////////////////////////////////////////////////////////////////////

	public static void task36() { // 36

		double resF;
		double x = Math.random() * 201 - 100;

		if (x <= 3) {
			resF = x * x - 3 * x + 9;
		} else {
			resF = 1 / (x * x * x + 6);
		}
		System.out.print(resF);
		return;
	}

/////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void task37() { // 37

		double resF;
		double x = Math.random() * 201 - 100;

		if (x >= 3) {
			resF = -1 * x * x + 3 * x + 9;
		} else {
			resF = 1 / (x * x * x - 6);
		}
		System.out.print(resF);
		return;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////

	public static void task38() { // 38

		double resF;
		double x = Math.random() * 201 - 100;

		if (x >= 0 && x <= 3) {
			resF = x * x;
		} else {
			resF = 4.0;
		}
		System.out.print(resF);
		return;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////

	public static void task39() { // 39

		double resF;
		double x = Math.random() * 201 - 100;

		if (x >= 8) {
			resF = -1 * x * x + x - 9;
		} else {
			resF = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.print(resF);
		return;
	}

////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void task40() { // 40

		double resF;
		double x = Math.random() * 201 - 100;

		if (x <= 13) {
			resF = -1 * Math.pow(x, 3) + 9;
		} else {
			resF = -3 / (x + 1);
		}
		System.out.print(resF);
		return;
	}

}
