package by.stech.les08.customer;

import java.util.Scanner;

public class FindCustomer {

	public static Customer[] sortByNameAndLastName(Customer[] ar) {

		for (int i = 0; i < ar.length - 1; i++) {
			String youngerName = ar[i].getName();
			String youngerLastName = ar[i].getLastName();
			int minIndex = i;
			for (int j = i + 1; j < ar.length; j++) {
				String currentLastName = ar[j].getLastName();
				String currentName = ar[j].getName();
				if (youngerName.compareToIgnoreCase(currentName) == 0) {
					if (youngerLastName.compareToIgnoreCase(currentLastName) > 0) {
						minIndex = j;
						youngerLastName = currentLastName;
					}
				} else if (youngerName.compareToIgnoreCase(currentName) > 0) {
					minIndex = j;
					youngerName = currentName;
				}
			}
			Customer temp = ar[i];
			ar[i] = ar[minIndex];
			ar[minIndex] = temp;
		}
		return ar;
	}

	public static Customer[] sortByCard(Customer[] ar) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter min and max value of credit Card number >> ");
		int min = 0;
		int max = 0;
		do {
			min = sc.nextInt();
			max = sc.nextInt();
			if (min < 1000 || min > 9999 || max < 1000 || max > 9999) {
				System.out.println("Invalid values! Try again!");
			}
		} while (min < 1000 || min > 9999 || max < 1000 || max > 9999);

		int n = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getCreditCard() >= min && ar[i].getCreditCard() <= max) {
				n++;
			}
			if (n == 0) {
				System.out.println("There isn't so cards!");
				return null;
			}
		}
		Customer[] res = new Customer[n];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getCreditCard() >= min && ar[i].getCreditCard() <= max) {
				res[j] = ar[i];
				j++;
			}
		}
		return res;
	}

}
