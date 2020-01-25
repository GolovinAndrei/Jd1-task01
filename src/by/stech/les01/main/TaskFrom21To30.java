package by.stech.les01.main;

public class TaskFrom21To30 {

	public static void main(String[] args) {
	
	}

	public static void task21() {		//21
		double numberStart = 526.325;
		double round = Math.floor(numberStart);
		int mantis = (int) ((numberStart - round) * 1000);
		double numberEnd = mantis + round / 1000;
		System.out.print(numberEnd);
		return;
	}
///////////////////////////////////////////////////////////////	
	public static void task22 () {		//22
		int timeSec = 89620;

		int hours = timeSec / 3600;
		System.out.print(hours + "ч ");
		int minutes = (timeSec % 3600) / 60;
		System.out.print(minutes + "мин ");
		int sec = timeSec % 3600 - minutes*60;
		System.out.print(sec + "c");
		return;
	}
	
//////////////////////////////////////////////////////////////////	
	public static void task23() {		//23
		double r = 138.56;
		double R = 322.32;

		double squareRing = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		System.out.println (squareRing);
		return;
	}
	
/////////////////////////////////////////////////////////////////	
	public static void task24 () {		//24
		
		double a=35.5;
		double b=21.9;
		double ang=65;
		
		double square=0.5*(a+b)*(Math.abs(a-b)/2)*Math.tan(ang);
		System.out.println (square);
		return;
		
	}
	
//////////////////////////////////////////////////////////////////	
	public static void task25 () { 		//25
		double a=10;
		double b=25;
		double c=2;
		double x1;
		double x2;
		if (a==0) {
			System.out.println("The equation is not quadratic!");
		}
			
		double discr = Math.pow(b, 2) - 4 * a * c;
		if (discr >= 0) {
			x1 = (-b + Math.sqrt(discr)) / (2 * a);
			x2 = (-b - Math.sqrt(discr)) / (2 * a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);

		} else {
			System.out.print("No roots!");
		}
		return;

	}
///////////////////////////////////////////////////////////////////	
	public static void task26 () {			//26
		double a = 25.03;
		double b = 12.74;
		double angleY = 30;

		double square = 0.5 * a * b * Math.sin(angleY);
		System.out.print(square);
		return;
	}
	
///////////////////////////////////////////////////////////////////	
	public static void task27 () {			//27
		int a = 2;

		int b = a * a;
		int c = b * b;
		int d = c * c; // a в 8-ой степени

		int g = d * b; // а в 10-ой степени

		System.out.print(d + "  ");

		int f = (int) (Math.pow(a, 8));
		System.out.print(f);
		return;

	}

///////////////////////////////////////////////////////////////////
	public static void task28 () {			//28
		double angleRad = 5.77;

		double temp1 = angleRad * 180 / Math.PI;
		int angleDegree = (int) Math.floor(temp1);
		double temp2 = (temp1 - angleDegree) * 60;
		int angleMinut = (int) Math.floor(temp2);
		double temp3 = (temp2 - angleMinut) * 60;
		int angleSecond = (int) Math.floor(temp3);
		System.out.println(angleDegree + " deg " + angleMinut + " min " + angleSecond + " sec ");
		return;
	}
	
////////////////////////////////////////////////////////////////////	
	public static void task29 () {			//29
		
		double a=60.0;
		double b=60.0;
		double c=60.0;
		
		double angleA = Math.acos((b*b+c*c-a*a)/(2*b*c));
		double angleB= Math.acos((a*a+c*c-b*b)/(2*a*c));
		double angleC=Math.acos((b*b+a*a-c*c)/(2*b*a));
		
		System.out.print (angleA+" "+angleB+" "+angleC);
		return;
	}
	
////////////////////////////////////////////////////////////////////	
public static void task30 () {		//30
		
		double r1=15;
		double r2=20.85;
		double r3=12.14;

		double resist = 1 / (1 / r1 + 1 / r2 + 1 / r3);
		System.out.print (resist);
		return;
	}

}
