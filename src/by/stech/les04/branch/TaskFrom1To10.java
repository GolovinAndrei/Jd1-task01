package by.stech.les04.branch;

import java.util.Random;

public class TaskFrom1To10 {

	public static void main(String[] args) {

		// task01();
		// task02();
		// task03();
		// task04();
		// task07();
		// task08();
		// task09();
		task10();

	}

	public static void task01() { // 1. Треугольник задан координатами своих вершин. Написать метод для вычисления
									// его площади.
		double x1 = 11.25;
		double x2 = 2.5;
		double x3 = 14.0;
		double y1 = 24.37;
		double y2 = 10.11;
		double y3 = 16.85;

		double side1 = sideLeng(x1, x2, y1, y2);
		double side2 = sideLeng(x2, x3, y2, y3);
		double side3 = sideLeng(x3, x1, y3, y1);

		System.out.println("Squae is: " + sqTreang(side1, side2, side3));

		return;
	}

	public static double sideLeng(double x1, double x2, double y1, double y2) {

		double side = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return side;
	}

	public static double sqTreang(double a, double b, double c) {

		double p = (a + b + c) / 2;
		double sc = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return sc;

	}

//////////////////////////////////////////////////////////////////////////////////////	

	public static void task02() { // 2 Написать метод(методы) для нахождения наибольшего общего делителя и
									// наименьшего общего кратного двух
									// натуральных чисел:

		// Random ran=new Random();
		int a = 28;// ran.nextInt();
		int b = 4;// ran.nextInt();
		int nod;
		int nok;

		nod = nod(a, b);
		nok = nok(a, b);
		System.out.println(a + "   " + b);
		System.out.println("НОД= " + nod);
		System.out.println("НОК= " + nok);
		return;
	}

	public static int nod(int a, int b) {
		int nod = 0;
		int min = a;
		if (b < a) {
			min = b;
		}

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;

	}

	public static int nok(int a, int b) {

		int nok = 0;
		int max = a;
		if (b > a) {
			max = b;
		}

		for (int i = max;; i++) {
			if (i % a == 0 && i % b == 0) {
				nok = i;
				break;
			}

		}
		return nok;

	}

///////////////////////////////////////////////////////////////////////////////////	

	public static void task03() { // 3 Написать метод(методы) для нахождения наибольшего общего делителя четырех
									// натуральных чисел.
		int a = 100;
		int b = 70;
		int c = 20;
		int d = 15;

		System.out.println(nod4(a, b, c, d));
		return;
	}

	public static int nod4(int a, int b, int c, int d) {
		int nod = 0;
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;

	}
/////////////////////////////////////////////////////////////////////////////////////

	public static void task04() { // 4 Написать метод(методы) для нахождения наименьшего общего кратного трех
									// натуральных чисел.
		int a = 3;
		int b = 15;
		int c = 20;

		System.out.println(nok3(a, b, c));
		return;

	}

	public static int nok3(int a, int b, int c) {

		int nok = 0;
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		for (int i = max;; i++) {
			if (i % a == 0 && i % b == 0 && i % c == 0) {
				nok = i;
				break;
			}

		}
		return nok;
	}

//////////////////////////////////////////////////////////////////////////////		

	public static void task05() { // 5 Написать метод(методы) для нахождения суммы большего и меньшего из трех
									// чисел.
		int a = (int) Math.random() * 100;
		int b = (int) Math.random() * 100;
		int c = (int) Math.random() * 100;
		int sum;

		sum = maxOf3(a, b, c) + minOf3(a, b, c);
		System.out.println(sum);
		return;
	}

	public static int maxOf3(int a, int b, int c) {

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static int minOf3(int a, int b, int c) {

		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

////////////////////////////////////////////////////////////////////////////	

	public static void task06() { // 6 Вычислить площадь правильного шестиугольника со стороной а, используя метод
									// вычисления площади
									// треугольника.

		double a = Math.random() * 100;

		double squareT = sqTreang(a, a, a);
		double sqareHex = 6 * squareT;

		System.out.println(sqareHex);
		return;
	}

///////////////////////////////////////////////////////////////////////////////

	public static void task07() { // 7 На плоскости заданы своими координатами n точек. Написать метод(методы),
									// определяющие, между какими из
									// пар точек самое большое расстояние. Указание. Координаты точек занести в
									// массив.
		int[] arX = { 14, 12, 3, 25 };
		int[] arY = { 1, 23, 74, 12 };
		int[] res = new int[4];
		double maxDist = 0;
		double dist;
		for (int i = 0; i < arX.length - 1; i++) {
			for (int j = i + 1; j < arY.length; j++) {
				dist = pointsDist(arX[i], arY[i], arX[j], arY[j]);
				if (dist > maxDist) {
					maxDist = dist;
					res[0] = arX[i];
					res[1] = arY[i];
					res[2] = arX[j];
					res[3] = arY[j];
				}

			}

		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + "  ");
		}
		return;

	}

	public static double pointsDist(int x1, int y1, int x2, int y2) {

		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return dist;
	}

////////////////////////////////////////////////////////////////////////////////////////////	

	public static void task08() { // 8 Составить программу, которая в массиве A[N] находит второе по величине
									// число (вывести на печать число,
									// которое меньше максимального элемента массива, но больше всех других
									// элементов).
		Random ran = new Random();
		int n = 10;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ran.nextInt();
		}
		int pos = maxNumPos(a);

		int temp = a[0];
		a[0] = a[pos];
		a[pos] = temp;

		int max = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		return;

	}

	public static int maxNumPos(int[] a) {
		int pos = 0;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				pos = i;
			}
		}
		return pos;
	}

////////////////////////////////////////////////////////////////////////////////////

	public static void task09() { // 9 Написать метод(методы), проверяющий, являются ли данные три числа взаимно
		int a = 3; 					// простыми.
		int b = 7;
		int c = 11;

		mutSimple(a, b, c);

	}

	public static void mutSimple(int a, int b, int c) {

		int count = 0;
		int min = a;
		if (b < a) {
			min = b;
		}
		if (min < c) {
			min = c;
		}

		for (int i = min; i > 1; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				count++;

			}
		}
		if (count > 0) {
			System.out.println("Numbers are not mutually simple. They have " + count + " common dividers");
		} else {
			System.out.println("Numbers are mutually simple");
		}

		return;

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public static void task10() { 				// 10 Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
	
		double sum=0;
		
		for (int i=1; i<=9; i++) {
			
			if (i%2!=0) {
				sum+=fact(i);
			}
		}
		System.out.println(sum);
		return;
	
	}
	
	public static double fact (int a) {
		double fact=1;
		for (int i=1; i<=a; i++) {
			fact*=i;
		}
		return fact;
		}

}
