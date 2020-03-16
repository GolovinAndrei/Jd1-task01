package by.stech.les08.airline;

import java.util.List;

public class AirlineView {

	public void printAirline(Airline al) {
		System.out.print("Destination: " + al.getDistPoint() + "\n" + "Flight number: " + al.getFlightNumber() + "\n"
				+ "Type of plane: " + al.getPlaneType() + "\n" + "Departure time: " + al.getTime().getHour() + ":"
				+ al.getTime().getMinute() + "\n" +"Day of departure "+ al.getDay()+"\n");
		System.out.println();

	}

	public void printList(List<Airline> airline) {
		for (Airline al : airline) {
			printAirline(al);
		}

	}

	public void printAirlineAr(Airline[] al) {
		for (Airline i : al) {
			printAirline(i);
		}
	}
}
