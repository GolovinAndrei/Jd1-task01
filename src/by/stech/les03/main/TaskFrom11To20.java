package by.stech.les03.main;

public class TaskFrom11To20 {

	public static void main(String[] args) {
		// task11();
		// task12();
		// task13();
		// task14();
		// task15();
		// task16();
		// task17();
		// task18();
		// task19();
	}

	public static void task11() { // 11 Составить программу нахождения разности кубов первых двухсот чисел
		double dif = 0;
		for (int i = 1; i <= 200; i++) {
			int x = i * i * i;
			dif -= x;
		}
		System.out.print(dif);
		return;
	}

///////////////////////////////////////////////////////////////////////////

	public static void task12() { // 12 Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
									// Составьте программу
		int a = 1; // нахождения произведения первых 10 членов этой последовательности
		int mult = 1;
		for (int i = 2; i <= 10; i++) {
			a = 6 + a;
			mult *= a;
		}
		System.out.print(mult);
		return;
	}

////////////////////////////////////////////////////////////////////////////

	public static void task13() { // 13 Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом
									// 0.5
		double func;
		for (int x = -5; x <= 5; x += 0.5) {
			func = 5 - x * x / 2;
			System.out.print(func + " ");
		}
		return;

	}

///////////////////////////////////////////////////////////////////////////

	public static void task14() { // 14 Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		int n = 12;
		double res = 0;
		for (int x = 1; x <= n; x++) {
			res += 1 / x;

		}
		System.out.print(res);
		return;

	}

//////////////////////////////////////////////////////////////////////////

	public static void task15() { // 15 Вычислить : 1+2+4+8+...+ 2 в 10 степени

		int n = 10;
		int res = 0;
		for (int x = 1; x <= n; x++) {
			res += Math.pow(2, x);

		}
		System.out.print(res);
		return;

	}

//////////////////////////////////////////////////////////////////////////

	public static void task16() { // 16 Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		int sum = 1;
		int res = 0;
		for (int i = 2; i <= 10; i++) {
			sum += i;
			res *= sum;

		}
		System.out.print(res);
		return;
	}

/////////////////////////////////////////////////////////////////////////

	public static void task17() { // 17 Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		double a = 5;
		int n = 10;
		double mult = a;
		for (int i = 2; i <= n; i++) {
			mult *= a + i - 1;
		}
		System.out.println(mult);
		return;
	}

//////////////////////////////////////////////////////////////////////////

	public static void task18() { // 18 Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
									// которых больше или
									// равен заданному е. Общий член ряда имеет вид:
		double sum = 0.00;
		double e = 5.55;
		int n = 14;

		for (int i = 1; i <= n; i++) {
			double a = Math.pow(-1, i - 1) / i;
			if (Math.abs(a) >= e) {
				sum += a;
			}
			System.out.println(sum);
		}
		return;

	}

/////////////////////////////////////////////////////////////////////////////

	public static void task19() { // 19 Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
									// которых больше или
									// равен заданному е.

		double sum = 0.00;
		double e = 5.55;
		int n = 14;

		for (int i = 1; i <= n; i++) {
			double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) >= e) {
				sum += a;
			}
			System.out.println(sum);
		}
		return;
	}
////////////////////////////////////////////////////////////////////////////

	public static void task20() { // 20 Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
									// которых больше или
									// равен заданному е. Общий член ряда имеет вид:

		double sum = 0.00;
		double e = 25.32;
		int n = 14;

		for (int i = 1; i <= n; i++) {
			double a = 1 / ((3 * i - 2) * (3 * i + 1));
			if (Math.abs(a) >= e) {
				sum += a;
			}
			System.out.println(sum);
		}
		return;
	}

}
