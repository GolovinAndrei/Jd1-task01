package by.stech.les02.main;

public class TaskFrom11To20 {

	public static void main(String[] args) {
		task12();
		task13();
		task16();
		task18();
		task20();
	}

	public static void task11() { // 11 Составить программу, которая определит площадь какого треугольника больше.
		double s1 = Math.random() * 100;
		double s2 = Math.random() * 100;
		if (s1 == s2) {
			System.out.println("Triangles are equal");
			return;
		}
		if (s1 > s2) {
			System.out.println("First Triangle is bigger");
		} else {
			System.out.println("Second Triangle is bigger");
		}

		return;
	}

/////////////////////////////////////////////////////////////////////////	
	public static double posOrNegPow(double a) {
		if (a < 0) {
			a = Math.pow(a, 4);
		} else {
			a = Math.pow(a, 2);
		}
		return a;
	}

	public static void task12() { // 12 Даны три действительных числа. Возвести в квадрат те из них, значения
									// которых неотрицательны, и в четвертую степень — отрицательные.
		double x = -23.45;
		double y = 10.05;
		double z = 55.0;

		x = posOrNegPow(x);
		y = posOrNegPow(y);
		z = posOrNegPow(z);

		return;

	}

/////////////////////////////////////////////////////////////////////////////

	public static double length(int a, int b) {

		double len = Math.sqrt(a * a + b * b);
		return len;
	}

	public static void task13() { // 13 Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
									// которая из точек находится ближе к началу координат.
		int x1 = 12;
		int y1 = 4;
		int x2 = 11;
		int y2 = 7;

		if (length(x1, y1) < length(x2, y2)) {
			System.out.println("First point is closer to the center");
		} else {
			System.out.println("Second point is closer to the center");

		}
		return;
	}
////////////////////////////////////////////////////////////////////////////////

	public static void task14() { // 14 Даны два угла треугольника (в градусах). Определить, существует ли такой
									// треугольник, и если да, то будет ли он прямоугольным
		double angleA = 58.36;
		double angleB = 112.34;

		double angleC = 180 - angleA - angleB;
		if ((angleA + angleB) >= 180) {
			System.out.println("There isn't such triangle");
		}
		if (angleA == 90 || angleB == 90 || angleC == 90) {
			System.out.println("Right triangle");
		}
		return;
	}

///////////////////////////////////////////////////////////////////////////////
	public static void task15() { // 15 Даны действительные числа х и у, не равные друг другу. Меньшее из этих
									// двух чисел заменить половиной их суммы, а большее — их удвоенным
									// произведением.
		double x = 255.32;
		double y = 471.30;
		double temp1;
		double temp2;

		temp1 = (x + y) / 2;
		temp2 = 2 * x * y;

		if (x < y) {
			x = temp1;
			y = temp2;
		} else {
			x = temp2;
			y = temp1;
		}

		return;
	}

////////////////////////////////////////////////////////////////////////////////
	public static void task16() { // 16 На плоскости ХОY задана своими координатами точка А. Указать, где она
									// расположена (на какой оси или в каком координатном угле).
		int x = 3;
		int y = -4;

		if (x == 0 && y == 0) {
			System.out.println("Point in the center of coordinates");
		} else if (x == 0) {
			System.out.println("point on the y axis");

		} else if (y == 0) {
			System.out.println("Point on the x axis");
		} else if (y > 0) {

			if (x > 0) {
				System.out.println("Point in the first quater");
			} else {
				System.out.println("Point in the fours quater");
			}
		}

		else if (y < 0) {
			if (x > 0) {
				System.out.println("Point in the second quarter");
			} else {
				System.out.println("Point in the third quarter");
			}
		}
		return;
	}

///////////////////////////////////////////////////////////////////////////////////////	

	public static void task17() { // 17 Даны целые числа т, п. Если числа не равны, то заменить каждое из них
									// одним и тем же числом, равным большему из исходных, а если равны, то заменить
									// числа нулями.
		int m = 12;
		int n = 14;

		if (m != n) {
			n = Math.max(m, n);
			m = n;
		} else {
			m = n = 0;

		}
		return;
	}

//////////////////////////////////////////////////////////////////////////////////////	

	public static void task18() { // 18 Подсчитать количество отрицательных среди чисел а, b, с.
		double a = -5;
		double b = 15.35;
		double c = 0;

		int count = 0;

		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
		}

		System.out.println(count);
		return;
	}

//////////////////////////////////////////////////////////////////////////////////////////

	public static void task19() { // 19 Подсчитать количество положительных среди чисел а, b, с.
		double a = 55.36;
		double b = -8;
		double c = -1022.33;

		int count = 0;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}

		System.out.println(count);
		return;
	}

//////////////////////////////////////////////////////////////////////////////////////////	

	public static void task20() { // 20 Определить, делителем каких чисел а, b, с является число k
		double a = 55;
		double b = 3;
		double c = -1022.33;

		double k = 11.0;

		if (a % k == 0) {
			System.out.print(a + " ");
		}
		if (b % k == 0) {
			System.out.print(b + " ");
		}
		if (c % k == 0) {
			System.out.print(c + " ");
		}

		return;

	}

}
