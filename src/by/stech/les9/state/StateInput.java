package by.stech.les9.state;

import java.util.Scanner;

public class StateInput {

	public static City[] cityAr(int count) {
		Scanner sc = new Scanner(System.in);
		City[] ca = new City[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter name of city > ");
			ca[i] = new City(sc.nextLine());
		}
		return ca;
	}

	public static Area[] areaAr(int AreaCount) {
		Scanner sc = new Scanner(System.in);
		Area[] aa = new Area[AreaCount];
		for (int i = 0; i < AreaCount; i++) {
			System.out.println("Number of cities in each area> ");
			int n = sc.nextInt();
			aa[i] = new Area(sc.nextLine(), cityAr(n));
		}
		return aa;
	}

	public static Region[] regionAr(int c) {
		Scanner sc = new Scanner(System.in);
		Region[] ra = new Region[c];
		for (int i = 0; i < c; i++) {
			System.out.println("Number of areas in each region> ");
			int n = sc.nextInt();
			System.out.println("Enter name of regional centr > ");
			String regionalCentr = sc.nextLine();
			System.out.println("Enter the square > ");
			double square = sc.nextDouble();
			System.out.println("Enter name of region> ");
			String regionName = sc.nextLine();
			ra[i] = new Region(regionalCentr, square, regionName, areaAr(n));
		}
		return ra;
	}

}
