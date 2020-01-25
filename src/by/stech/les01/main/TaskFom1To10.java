package by.stech.les01.main;

public class TaskFom1To10 {

	public static void main(String[] args) {
		
			}
//////////////////////////////////////////////////////////////////////////////
	public static void task01() {		//1
		double x = 253.8;
		double y = 14.7;

		double res = x + y;
		System.out.println("The result of the sum: " + res);
		res = x - y;
		System.out.println("The result of the subtract.: " + res);
		res = x * y;
		System.out.println("The result of the multip.: " + res);
		res = x / y;
		System.out.println("The result of the div.: " + res);
		return;

	}
/////////////////////////////////////////////////////////////////////////////	
	public static void task02() {			//2
		int a = 10;

		int c = 3 + a;
		System.out.println("The result of function c is: " + c);
		return;

	}
/////////////////////////////////////////////////////////////////////////////	
	public static void task03() {			//3
		int x = 21;
		int y = 8;

		int z = 2 * x + (y - 2) * 5;

		System.out.println("The result of funcion z is: " + z);
		return;

	}
////////////////////////////////////////////////////////////////////////////	
	static double func(double x, double y, double z) {			//4
		double res = ((x - 3) * y / 2) + z;
		return res;

	}

	public static void task4() {
		System.out.println("The result of funcion z is: " + func(12.3, 9.5, 7.6));
		return;
	}
	
	
////////////////////////////////////////////////////////////////////////////	
	public static void task05() {			//5
		double number1=44.75;
		double number2=65.23;
		
		double avg = (number1+number2)/2;
		return;

		}
///////////////////////////////////////////////////////////////////////////
	public static void task06() {		//6
		double vol1 = 80;
		double vol2;
		int n = 10;
		int m = 13;

		vol2 = (80 / n + 12) * m;
		return;

	}
////////////////////////////////////////////////////////////////////////////	
	public static void task07() { 		//7
		double width=80;
		double length=2*width;
		
		double Square= width*length;
		return;

	}
/////////////////////////////////////////////////////////////////////////////	
	static double exp(double a, double b, double c) {		//8

		double res = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))) / 2 * a - c * Math.pow(a, 3) + Math.pow(b, -2);
		return res;

	}

	public static void task8() {
		double res = exp(3, 12.5, 9);
		return;
	}
	
//////////////////////////////////////////////////////////////////////////////	
	static double exp(double a, double b, double c, double d) {		//9

		double res = (a / c) * (b / d) - (a * b - c) / c * d;
		return res;

	}

	public static void task9() {
		double res = exp(3, 12.5, 9, 17);
		System.out.println ("Result of expression is "+ res);
		return;
	}
///////////////////////////////////////////////////////////////////////////////	
	static double exp(double a, double b) {			//10

		double res = (Math.sin(a)+Math.cos(b))/(Math.cos(a)-Math.sin(b))*Math.tan(a*b);
		return res;

	}

	public static void task10() {
		double res = exp(45.65, 80);
		System.out.println ("Result of expression is "+ res);
		return;
	}
	
		
	}



















}
