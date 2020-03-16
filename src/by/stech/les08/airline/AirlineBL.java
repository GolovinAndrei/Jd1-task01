package by.stech.les08.airline;

import java.util.List;
import java.util.Scanner;

public class AirlineBL {

	public String enterData() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data for search >> ");
		String data = sc.nextLine();
		return data;

	}

	public Airline[] findByDistination(List<Airline> airlines) {

		String dist = enterData();
		int n = 0;
		for (int i = 0; i < airlines.size(); i++) {
			String currentDist = airlines.get(i).getDistPoint();
			if (currentDist.compareToIgnoreCase(dist) == 0) {
				n++;
			}
		}
		int j = 0;
		Airline[] res = new Airline[n];
		for (int i = 0; i < airlines.size(); i++) {
			String currentDist = airlines.get(i).getDistPoint();
			if (currentDist.compareToIgnoreCase(dist) == 0) {
				res[j] = airlines.get(i);
				j++;
			}
		}
		return res;
	}

	public Airline[] findByDay(List<Airline> airlines) {

		String day = enterData();
		int n = 0;
		for (int i = 0; i < airlines.size(); i++) {

			String currentDay = airlines.get(i).getDay().getDayOfWeek();
			if (currentDay.compareToIgnoreCase(day) == 0) {
				n++;
			}
		}
		int j = 0;
		Airline[] res = new Airline[n];
		for (int i = 0; i < airlines.size(); i++) {
			String currentDay = airlines.get(i).getDay().getDayOfWeek();
			if (currentDay.compareToIgnoreCase(day) == 0) {
				res[j] = airlines.get(i);
				j++;
			}
		}
		return res;
	}

	public Airline[] findByDayAndTime(List<Airline> airlines) {

		Airline[] temp = findByDay(airlines);
		int hourForSearch = Integer.parseInt(enterData());
		int minForSearch = Integer.parseInt(enterData());
		Airline[] res = new Airline[temp.length];
		int j = 0;
		for (Airline i : temp) {

			if (hourForSearch == i.getTime().getHour()) {
				if (minForSearch < i.getTime().getMinute()) {
					res[j] = i;
					j++;
				}
			} else if (hourForSearch < i.getTime().getHour()) {
				res[j] = i;
				j++;

			}
		}

		return temp;
	}

}
