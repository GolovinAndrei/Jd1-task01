package by.stech.les08.airline;

import java.util.List;

public class AirlineMain {
	
	public static void main (String [] args) {
		
		
		AirlineDataInit init = new AirlineDataInit();
		AirlineView pr=new AirlineView();
		AirlineBL bl = new AirlineBL();
		
		List <Airline> airlines=init.createList();
		pr.printList(airlines);
		System.out.println("____________________________________________");
		
		//Airline [] airlinesByDist = bl.findByDistination(airlines);
		//pr.printAirlineAr(airlinesByDist);
		//System.out.println("____________________________________________");
		
		//Airline [] airlinesByDay= bl.findByDay(airlines);
		//pr.printAirlineAr(airlinesByDay);
		//System.out.println("____________________________________________");
		
		Airline [] airlinesByDayTime = bl.findByDayAndTime(airlines);
		pr.printAirlineAr(airlinesByDayTime);
		System.out.println("____________________________________________");
		
		
	}
	

}
