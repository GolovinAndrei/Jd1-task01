package by.stech.les9.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccauntConsoleInput {

	public static List<Accaunt> createAccaunts(int n) {
		List<Accaunt> accaunts = new ArrayList<Accaunt>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number of accaunt > ");
			int number = sc.nextInt();
			System.out.println("Enter amount of credits > ");
			double credit = sc.nextDouble();

			Accaunt ac = new Accaunt(number, credit);
			accaunts.add(ac);

		}

		return accaunts;

	}
}
