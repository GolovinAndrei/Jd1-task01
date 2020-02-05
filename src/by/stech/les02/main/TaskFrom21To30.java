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

	public static void task21() { // 21 ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
									// �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ���������
									// ����� ���� �������� �������!� ��� ���� �������� ��������!�.
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

	public static void task22() { // 22 ���������������� �������� ���������� � � � ���, ����� � � ���������
									// ������� �� ���� ��������, � � y - �������.
		int x = 15;
		int y = 100;

		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

	}

//////////////////////////////////////////////////////////////////////////////	

	public static void task23() { // 23 ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
									// ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.

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

	public static void task24() { // 23 ��������� ���������, ������������ ��������� ������� �� ������� � ��������
									// �����, ���� �� �������� ������ ���������� ��������� �.

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

	public static void task25() { // 25 �������� ��������� � ������ ������� ��������� ������� � ���������, �������
									// ������� ��������� �������������� �������� �, ���� ����������� � �������
									// ��������� 60� �.
		double temp = 35.5;
		if (temp > 60.0) {
			System.out.println("Dangerous situation!!!");
		}
	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task26() { // 26 �������� ��������� ���������� ����� �������� � �������� �� ���� �����.

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

	public static void task27() { // 27 ����� max{min(a, b), min(c, d)}.

		int a = 25;
		int b = 3336;
		int c = 47;
		int d = -6;

		int res = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println(res);
		return;

	}

////////////////////////////////////////////////////////////////////////////////////////	

	public static void task28() { // 28 ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
									// ����� d, �� ����� max(d � a, d � b, d �c).

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

	public static void task29() { // 29 ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
									// ����������� �� ����� ������.
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

	public static void task30() { // 30 ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, �
									// �������� �� ����������� ����������, ���� ��� �� ���.

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
