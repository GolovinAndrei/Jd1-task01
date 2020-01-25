package by.stech.les01.main;

public class TaskFrom10To20 {

	public static void main(String[] args) {
	
	}

	public static void task11() {		//11
		double a = 20;
		double b = 30;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double per = a + b + c;
		double square = 0.5 * a * b;
		System.out.println (per + "  "+square);
		return;
	}
/////////////////////////////////////////////////////////////////////	
	public static void task12() {		//12
		double x1 = 20.0;
		double x2 = 55.0;
		double y1 = 30.0;
		double y2 = 48.0;
		double dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println (dist);
		return;
	}
//////////////////////////////////////////////////////////////////////	
	static double dist(double x1, double y1, double x2, double y2) {				//13
		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return dist;
	}

	static double per(double a, double b, double c) {
		double per = a + b + c;
		return per;
	}

	static double squareGeron(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return square;

	}

	public static void task13() {
		double x1 = 20;
		double x2 = 55;
		double x3 = 55;
		double y1 = 30;
		double y2 = 30;
		double y3 = 30;

		double a = dist(x1, y1, x3, y3);
		double b = dist(x1, y1, x2, y2);
		double c = dist(x2, y2, x3, y3);

		double per = per(a, b, c);
		double square = squareGeron(a, b, c);

		System.out.println("Perimetr is " + per);
		System.out.println("Squre is " + square);

	}
	
		
////////////////////////////////////////////////////////////////////////	
	public static void task14() {		//14
		double r = 20;

		double circ = 2 * Math.PI * r;
		double square = Math.PI * r * r;
		System.out.println (circ+ "  "+square);
		return;
	}

////////////////////////////////////////////////////////////////////////
	public static void task15() {			//15
		
		for (int i = 1; i <= 4; i++) {
			double powPi =Math.pow(Math.PI, i);
			System.out.println(i + "-power of Pi: " + powPi);

		}
		return;
	}

///////////////////////////////////////////////////////////////////////	
	public static void task17() {		//17
		double number1 = 5;
		double number2 = 3.1;

		double avgA = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
		double avgG = Math.sqrt(Math.abs(Math.pow(number1, 3)) * Math.abs(Math.pow(number2, 3)));

		System.out.println(avgA);
		System.out.println(avgG);
		return;
	}

////////////////////////////////////////////////////////////////////////
	public static void task18 () {			//18
		double length = 20.5;

		double square = length * length;
		double fullSquare = square * 6;
		double vol = square * length;
		//System.out.println ();
		return;
	}
///////////////////////////////////////////////////////////////////////
	public static void task19() {		//19
		double a = 6.0;

		double h = Math.sqrt(Math.pow(a, 2) - Math.pow(a / 2, 2)); // высота
		System.out.println (h);
		double square = 0.5 * h * a; // площадь
		System.out.println (square);
		double r = (2 * square) / (3 * a); // радиус вписанной окружности
		System.out.println (r);
		double R = Math.pow(a, 3) / (4 * square); // радиус описанной окружности
		System.out.println (R);
		return;
	}

/////////////////////////////////////////////////////////////////////////
	public static void task20 () {			//20
		double c=50.0;
		double squareRound=Math.pow(c, 2)/4*Math.PI;
		System.out.println (squareRound);
		return;
	}
	
}
