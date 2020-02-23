package by.stech.les05.mass;

import by.stech.les01.main.TaskFom1To10;

public class TaskFrom11To20 {

	public static void main(String[] args) {
		// task11();
		// task12();
		// task13();
		// task14();
		// task15();
		// task16();
		// task17();
		// task18();
		task19();
		// task20();
	}

	public static void task11() { // 11 Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
									// остаток от деления на М равен L (0 < L < М-1).

		int m = 7;
		int[] a = TaskFrom1To10.createInit(20);

		for (int j = 0; j < a.length; j++) {

			if (0 < (a[j] % m) && (a[j] % m) < (m - 1)) {
				System.out.print(a[j] + " ");

			}

		}
		return;

	}

///////////////////////////////////////////////////////////////	

	public static void task12() { // 12 Задана последовательность N вещественных чисел. Вычислить сумму чисел,
									// порядковые номера которых являются простыми числами.
		int n = 30;
		double[] m = new double[n];

		for (int i = 0; i < m.length; i++) {
			m[i] = Math.random() * 100;

		}
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				sum += m[i];
			}
			System.out.println(sum);

		}
		return;
	}

//////////////////////////////////////////////////////////////////	

	public static void task13() { // 13 Определить количество элементов последовательности натуральных чисел,
									// кратных числу М и заключенных в промежутке от L до N.

		int l = 1;
		int n = 100;
		int m = 95;
		int c = 0;
		for (int i = l; i < n; i++) {
			if (i % m == 0) {
				c++;
			}
		}
		return;
	}
///////////////////////////////////////////////////////////////////	

	public static void task14() { // 14
		int sum = 0;
		int[] a = TaskFrom1To10.createInit(10);
		TaskFrom1To10.printArr(a);
		System.out.println();
		int min = a[1];
		int max = a[0];
		for (int i = 1; i < a.length; i += 2) {

			if (a[i] < min) {
				min = a[i];
			}
		}
		for (int j = 0; j < a.length; j += 2) {

			if (a[j] > max) {
				max = a[j];
			}
		}
		int res = max + min;
		System.out.println(res);
		return;
	}

////////////////////////////////////////////////////////////////////////	

	public static void task15() { // 15 Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать
									// те ее элементы, которые принадлежат отрезку [с, d].
		double c = 0;
		double d = 55.5;
		int count = 0;
		int n = 30;
		double[] m = new double[n];

		for (int i = 0; i < m.length; i++) {
			m[i] = Math.random() * 100;
		}
		double[] tempRes = new double[n];
		for (int i = 0; i < m.length; i++) {
			if (m[i] >= c && m[i] <= d) {
				tempRes[i] = m[i];
				count++;
			}

		}
		double[] res = new double[count];
		for (int i = 0; i < res.length; i++) {
			res[i] = tempRes[i];

		}
		return;

	}
/////////////////////////////////////////////////////////////////////////////

	public static void task16() { // 16

		int[] a = TaskFrom1To10.createInit(10);
		int max = 0;

		for (int i = 0; i < (a.length / 2); i++) {
			int sum = 0;
			sum = a[i] + a[(a.length - 1 - i)];
			if (sum > max) {
				max = sum;
			}

		}
		System.out.println(max);
		return;
	}

///////////////////////////////////////////////////////////////////////////	

	public static void task17() { // 17 Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую
									// последовательность, выбросив из исходной те члены, которые равны min
		int count = 0;
		int[] a = TaskFrom1To10.createInit(20);
		TaskFrom1To10.printArr(a);
		int minElement = TaskFrom1To10.minElement(a);

		for (int i = 0; i < a.length; i++) {

			if (a[i] == minElement) {
				count++;
			}

		}
		System.out.println();

		int n = 0;
		int[] res = new int[a.length - count];
		for (int i = 0; i < res.length; i++) {

			if (a[i] == minElement) {
				n++;
			}
			res[i] = a[i + n];
		}
		TaskFrom1To10.printArr(res);
		return;

	}

///////////////////////////////////////////////////////////////////////////////////

	public static void task18() { // 18 «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад
									// ячеек, в которые надо вставить игральные кубики. Но дверь открывается только
									// в том случае, когда в любых трех соседних ячейках сумма точек на
									// передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1
									// до 6 точек). Напишите программу, которая разгадывает код замка при условии,
									// что два кубика уже вставлены в ячейки

		int[] lock = new int[10];

		// int startPos1=(int)(Math.random()*10);
		lock[0] = (int) (Math.random() * 6 + 1);
		// int startPos2=(int)(Math.random()*10);
		lock[1] = (int) (Math.random() * 6 + 1);

		for (int i = 2; i < lock.length; i++) {

			lock[i] = 10 - lock[i - 1] - lock[i - 2];
		}
		TaskFrom1To10.printArr(lock);
	}

//////////////////////////////////////////////////////////////////////////////////////

	public static void task19() { // 19 В массиве целых чисел с количеством элементов n найти наиболее часто
									// встречающееся число. Если таких чисел
									// несколько, то определить наименьшее из них.
		int[] a = TaskFrom1To10.createInit(20);
		TaskFrom1To10.printArr(a);

		System.out.println();
		int tem = repeatingElem(a);
		System.out.println(tem);

	}

	public static int repeatingElem(int[] a) {
		int repeating = a[0];
		int max = 0;

		for (int i = 0; i < a.length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > max) {
				repeating = a[i];
				max = count;
			} else {
				if (count == max) {
					if (a[i] < repeating) {
						repeating = a[i];
					}
				}
			}

		}
		return repeating;
	}

///////////////////////////////////////////////////////////////////////////////////////////	

	public static void task20() { // 20 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив
									// из него каждый второй элемент (освободившиеся элементы заполнить нулями).
									// Примечание. Дополнительный массив не использовать.

		int[] a = TaskFrom1To10.createInit(10);
		TaskFrom1To10.printArr(a);
		System.out.println();

		for (int i = 1; i < a.length / 2; i++) {
			a[i] = a[i * 2];

		}
		for (int i = a.length / 2; i < a.length; i++) {
			a[i] = 0;
		}

		TaskFrom1To10.printArr(a);
		return;

	}
}
