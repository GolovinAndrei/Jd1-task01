package by.stech.les05.mass;

public class TaskFrom1To10 {

	public static void main(String[] args) {
		// task02();
		// task03();
		// task04();
		//task06();
		task09();

	}

	public static int[] createInit(int n) {

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20 + 1);
		}
		return arr;
	}

	public static void task01() { // 1 В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
									// которые кратны данному К.

		int k = 2;
		int[] A = createInit(10);
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % k == 0) {
				sum += A[i];
			}

		}
		return;

	}
///////////////////////////////////////////////////////////////////

	public static void task02() { // 2 В целочисленной последовательности есть нулевые элементы. Создать массив из
									// номеров этих элементов.

		int[] a = { 5, 0, 33, 65, 8, 10, 11, 15, 0, 66, 0, 1, 8 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		int[] res = new int[count];
		int j = 0;
		for (int t = 0; t < a.length; t++) {
			if (a[t] == 0) {
				res[j] = t;
				j++;
			}

		}

		printArr(res);
		return;
	}

	public static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return;
	}

/////////////////////////////////////////////////////////////////////////////	

	public static void task03() { // 3 Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
									// встречается раньше - положительное или
									/// отрицательное.

		int[] a = createInit(10);
		// printArr(a);
		int i = 0;
		int d;
		do {
			d = a[i];
			System.out.println(a[i]);
			if (d < 0) {
				System.out.println("negativ number was the first");
			}
			if (d > 0) {
				System.out.println("positiv number was the first");
			}
			i++;
		} while (d == 0);

		return;

	}
/////////////////////////////////////////////////////////////////////////////

	public static void task04() { // 4 Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
									// будет ли она возрастающей.

		int[] a = { 1, 2, 2, 4, 5, 9 };
		boolean b = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i] <= a[i - 1]) {
				b = false;
				System.out.println("raw isn't increasing!");
				break;

			}
		}
		if (b) {
			System.out.println("raw is increasing!");
		}
		return;

	}
//////////////////////////////////////////////////////////////////////////	

	public static void task05() { // 5 Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
									// из четных чисел этой последовательности.
									// Если таких чисел нет, то вывести сообщение об этом факте.
		int[] a = createInit(10);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
			if (count == 0) {
				System.out.println("There isn't even numbers! ");
			}
		}
		int[] res = new int[count];
		int j = 0;
		for (int t = 0; t < a.length; t++) {
			if (a[t] % 2 == 0) {
				res[j] = a[t];
				j++;
			}

		}

		printArr(res);
		return;
	}

///////////////////////////////////////////////////////////////////////////

	public static void task06() { // 6 Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
									// числовой оси, содержащую все эти числа.

		int[] a = createInit(10);

		System.out.println("Min nomber line: from " + minElement(a) + " to " + maxElement(a));

		return;
	}

	public static int maxElement(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static int minElement(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

///////////////////////////////////////////////////////////////////////////////////

	public static void task07() { // 7 Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
									// ее члены, большие данного Z, этим числом.
									// Подсчитать количество замен.
		int[] a = createInit(10);
		int z = (int) (Math.random() * 10);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
		}
		printArr(a);
		return;
	}
///////////////////////////////////////////////////////////////////////////////////////

	public static void task08() { // 8  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
									// в нем отрицательных,
									// положительных и нулевых элементов.
		int[] a = createInit(10);
		int neg = 0;
		int zero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				neg++;
			}
			if (a[i] == 0) {
				zero++;
			}
		}
		System.out.println(zero + " " + neg + " " + (a.length - zero - neg));
		return;

	}
///////////////////////////////////////////////////////////////////////////////////
	
	public static void task09() { 	// 9 Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

		
		int[] a = createInit(10);
		printArr(a);
		System.out.println();
		int minPos=minNumPos(a);
		int maxPos=by.stech.les04.branch.TaskFrom1To10.maxNumPos(a);
		int temp = a[minPos];
		a[minPos]=a[maxPos];
		a[maxPos]=temp;
		printArr(a);
		return;	
		
	}	
		
	public static int minNumPos(int[] a) {
		int pos = 0;
		int min = a[0];
		for (int j =1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
				pos = j;
			}
		}
		return pos;
	}		
		
////////////////////////////////////////////////////////////////////////////////////
	
	public static void task10() { 	// 10 Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	
		int[] a = createInit(20);
		
		for (int j =1; j < a.length; j++) {
			if (a[j]>j) {
				System.out.print(a[j]+" ");
			}
		}
		return;
	}


}
