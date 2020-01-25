package by.stech.les01.main;

//—оставить линейную программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным, и
//false Ч в противном случае:
public class Task37 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 100); 		// 1
		boolean res;

		// System.out.println(n);
		res = (n % 2 == 0 && n > 9);
		System.out.println(res);

		n = (int) (Math.random() * 9000 + 1000); 		// 2
		// System.out.println(n);
		int[] ar1 = Task16.digitOfNumber(n, 4);
		res = ((ar1[0] + ar1[1]) == ar1[2] + ar1[3]);
		System.out.println(res);

		n = (int) (Math.random() * 900 + 100);		 // 3
		int[] ar2 = Task16.digitOfNumber(n, 3);
		int sum = 0;
		for (int j : ar2) {
			sum += j;
		}
		res = (sum % 2 == 0);
		System.out.println(res);

		int x = 24; // 4
		int y = -15;
		int m = 2;
		int k = 40;
		res = (x < n && x > k);
		System.out.println(res);

		n = (int) (Math.random() * 900 + 100); 		// 5
		int[] ar3 = Task16.digitOfNumber(n, 3);
		sum = 0;
		for (int j : ar3) {
			sum += j;
		}
		res = (Math.pow(n, 2) == Math.pow(sum, 3));
		System.out.println(res);

		int a = (int) (Math.random() * 100); 		// 6
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		res = (a == b || b == c || a == c);
		System.out.println(res);

		n = (int) (Math.random() * 900 + 100); 		// 7
		int[] ar4 = Task16.digitOfNumber(n, 3);
		res = (ar4[0] + ar4[1] == ar4[2]);
		System.out.println(res);

		n = (int) (Math.random() * 100); 			// 8
		a = 8;
		for (int i = 0; i <= 4; i++) {
			res = (Math.pow(a, i) == n);
			if (res) {
				break;
			}
		}
		System.out.println(res);

		m = 12; 									// 9
		n = 7;
		a = 14;
		b = 37;
		c = 25;
		res = (n == a * m * m + b * m + c);
		System.out.println(res);

	}

}
