package by.stech.les01.main;

//Найти произведение цифр заданного четырехзначного числа.
public class Task16 {

	public static int[] digitOfNumber(int a, int b) { // метод для использования в задачах 35 и 36
		int res = 0;
		int i = 1;
		int[] digit = new int[b];
		while (res != a) {
			a -= res;
			res = (int) (a % Math.pow(10, i));
			digit[i - 1] = (int) (res / Math.pow(10, i - 1));
			i++;
		}
		return digit;
	}

	public static void main(String[] args) {
		int number = 12658;
		int res = 0;
		int n = 1;
		int mult = 1;
		while (res != number) {
			number -= res;
			res = (int) (number % Math.pow(10, n));
			int digit = (int) (res / Math.pow(10, n - 1));
			mult *= digit;
			n++;
		}

		System.out.println("Multiplication of digits is: " + mult);

	}

}
