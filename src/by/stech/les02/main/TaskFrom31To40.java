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

	public static void task31() { // 31 ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
									// ����������, ������� �� ������ ����� ���������.
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

	public static void task32() { // 32 �������� ���������, ������� �� �������� ���� ������ ����������, ��������
									// �� ����� �����-���� ���� �� ��� �������������.

		double a = Math.random() * 201 - 100;
		double b = Math.random() * 201 - 100;
		double c = Math.random() * 201 - 100;

		if (a + b > 0 || a + c > 0 || b + c > 0) {
			System.out.println("There is positiv sum");

		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////////	

	public static void task33() { // 33 �������� ���������, ������� �� ������ ����� ���������� ������� �������
		// ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
		// ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ���������
		// ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
		// ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.

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

	public static void task34() { // 34 ��������� ���������, ����������� ������ ���������� ���������� � �������
									// ��������. ��������� ����������� ��������� ����, ����� �����, ���������
									// �����������; ���� ����� �� ���������, �������� �� ������ ��������; ����
									// ����� ������� ������, ��� ����������, �� �������� ��������� ����� �
									// ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ����
									// � ��������� ������ ����������� �����.

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

	public static void task35() { // 35 ��������� ����� � ����� � ������������ ���� �� ������ ���??

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
