package by.stech.les02.main;

public class TaskFrom1To10 {

	public static void main(String[] args) {
		task01();
		task02();
		task03();
	}

	public static void task01() { 			// 1 Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
											// на экран цифру 7, в противном случае – цифру 8.
		double a = Math.random() * 10;
		double b = Math.random() * 10;

		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
		return;
	}

/////////////////////////////////////////////////////////////////	
	public static void task02() { 				// 2 Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
												// на экран слово «yes», в противном случае – слово «no»
		double a = Math.random() * 10;
		double b = Math.random() * 10;

		if (a > b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		return;
	}

/////////////////////////////////////////////////////////////////	
	public static void task03() {		//3   Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
			double a=Math.random()*10;
						
			if(a<3) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			return;
	}
////////////////////////////////////////////////////////////////	

	public static void task04() { 				// 4 Составить программу: равны ли два числа а и b?
		double a = Math.random() * 10;
		double b = Math.random() * 10;
		if (a==b) {
			System.out.println("Numbers are equal");
		}
		return;
	}

/////////////////////////////////////////////////////////////	
	
	public static void task05() { 				// 5 Составить программу: определения наименьшего из двух чисел а и b.
		double a = Math.random() * 10;
		double b = Math.random() * 10;
		double min=Math.min(a, b);
			System.out.println("Smallest number is "+min);
		
		return;
	}
	
/////////////////////////////////////////////////////////////
	public static void task06() { 				// 6 Составить программу: определения наибольшего из двух чисел а и b.
		double a = Math.random() * 10;
		double b = Math.random() * 10;
		double max=Math.max(a, b);
			System.out.println("The largest number is "+max);
		
		return;
	}
	
///////////////////////////////////////////////////////////////
	public static void task07() { 				// 7 Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
		double a = Math.random() * 100;
		double b = Math.random() * 100;
		double c = Math.random() * 100;
		double x = Math.random() * 100;
		double res=Math.abs(a*x*x+b*x+c);
			System.out.println(res);
		
		return;
	}
	
///////////////////////////////////////////////////////////////
	public static void task08() { 				// 8 Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		double a = Math.random() * 100;
		double b = Math.random() * 100;
			if (a==b) {
				System.out.println("Numbers are equal");
				return;
			}
			if (a*a<b*b) {
				System.out.println("Squared number b is bigger");
			}
			else {
				System.out.println("Squared number a is bigger");
				}
			return;
			}
	
////////////////////////////////////////////////////////////////////
	
	public static void task09() {		//9   Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
		double a=5.0;
		double b=5.0;
		double c=5.0;
					
		if(a==b&&b==c) {
			System.out.println("equilateral triangle");
		}
		if (a==b||a==c||b==c) {
			System.out.println("isosceles triangle");
		}
		return;
	}
/////////////////////////////////////////////////////////////////////
	
		public static void task010() {		//10   Составить программу, которая определит площадь какого круга меньше
			double r1=Math.random() * 100;
			double r2=Math.random() * 100;
			if (r1==r2) {
				System.out.println("Circles are equal");
				return;
			}
			double s1=Math.PI*Math.pow(r1, 2);
			double s2=Math.PI*Math.pow(r2, 2);
						
			double s=Math.min(s1, s2);
			System.out.println(s);	
			return;
		}
}
		

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
