package by.stech.les01.main;

public class TaskFrom31To40 {

	public static void main(String[] args) {

	}

	public static void task31() { // 31
		double v = 40;
		double v1 = 10;
		double t1 = 5;
		double t2 = 6;

		double wayOnLake = v * t1;
		double wayOnRiver = (v - v1) * t2;
		System.out.println(wayOnLake);
		System.out.println(wayOnRiver);
		return;
	}

////////////////////////////////////////////////////////////////////////////
	public static void task32() { // 32
		int m = 17;
		int n = 33;
		int k = 22;

		int p = 8;
		int q = 30;
		int r = 20;

		int hour = m + p;
		int min = n + q;
		int sec = k + r;

		if (sec > 59) {
			min++;
			sec -= 60;
		}
		if (min > 59) {
			hour++;
			min -= 60;
		}
		if (hour > 24)
			hour -= 24;

		System.out.print("New time is " + hour + " h " + min + " m " + sec + " s");
		return;
	}

///////////////////////////////////////////////////////////////////////////////////	
	public static void task33() { // 33
		char ch = 'f';
		int num = ch;

		System.out.println(num);

		char nextCh = (char) (num + 1);
		System.out.println(nextCh);

		char prevCh = (char) (num - 1);
		System.out.println(prevCh);
		return;

	}

/////////////////////////////////////////////////////////////////////////////////////
	public static void task34() { // 34
		double A = 2544134d;
		int mB = (int) (A / Math.pow(1024, 2));
		int ost = (int) (A % Math.pow(1024, 2));
		int kB = (int) (ost / 1024);
		int b = ost % 1024;
		System.out.println(mB + " mB " + kB + " kb " + b + " b");
		return;

	}

////////////////////////////////////////////////////////////////////////////////	
	public static void task35() { // 35
		int m = 32758;
		int n = 34;

		double div = (double) m / n;
		int in = (int) Math.floor(div);
		int mantis = (int) ((div - in) * 1000);

		int[] arrayIn = Task16.digitOfNumber(in, 3);
		int[] arrayMantis = Task16.digitOfNumber(mantis, 3);

		int temp = arrayMantis[0];
		for (int i : arrayMantis) {
			if (i > temp) {
				temp = i;
			}
		}
		System.out.println(temp);

		temp = arrayIn[0];
		for (int j : arrayIn) {
			// if (j)
			if (j < temp) {
				temp = j;
			}
		}
		System.out.println(temp);
		return;

	}

/////////////////////////////////////////////////////////////////////////////	
	public static void task36() { // 36
		int number = 23667;
		int[] digitArray = Task16.digitOfNumber(number, 5);
		int oddMult = 1;
		int evenMult = 1;

		for (int i = 0; i < digitArray.length; i++) {
			if (digitArray[i] != 0) {
				if (digitArray[i] % 2 == 0) {
					evenMult *= digitArray[i];
				} else {
					oddMult *= digitArray[i];
				}
			}
		}

		System.out.print((double) evenMult / oddMult);
		return;

	}

/////////////////////////////////////////////////////////////////////////////
	public static void task38() { // 38
		boolean res; // a
		float x = 3;
		float y = 4;

		if (x >= 0) {
			res = (y <= x + 4);
		} else {
			res = (y <= x - 4);
		}

		System.out.println(res);

		if (y >= 0) { // b
			res = (x >= -2 && x <= 2 && y <= 4);
		} else {
			res = (x >= -4 && x <= 4 && y >= -3);

		}
		System.out.println(res);

		if (y >= 0 && x >= 0) { // c
			res = (x * x + y * y <= 16);
		}

		if (y < 0 && x > 0) {
			res = (x * x + y * y <= 25);
		}
		System.out.println(res);
		return;
	}

////////////////////////////////////////////////////////////////////////////////	
	public static void task39() { // 39
		int x = 1445;

		int res1 = x * (x * (x * (2 * x - 3) + 4) - 5) + 6;
		System.out.println(res1);
		return;
	}

/////////////////////////////////////////////////////////////////////////////////	
	public static void task40() { // 40
		int x = 1445;

		int res1 = x * (-2 + (3 - 4 * x) * x);
		int res2 = 1 + x * (2 + x * (3 + 4 * x));
		System.out.println(res1 + "  " + res2);
		return;
	}

}
