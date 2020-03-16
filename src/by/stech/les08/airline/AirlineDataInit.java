package by.stech.les08.airline;

import java.util.ArrayList;
import java.util.List;

import by.stech.les08.time.Time;
import by.stech.train.bean.Train;

public class AirlineDataInit {

	public List<Airline> createList() {

		List<Airline> airlines = new ArrayList<Airline>();

		Airline al = new Airline("St.Petesburg", 388, 'B', new Time(12, 30, 00), DayOfWeek.MONDEY);
		airlines.add(al);
		al = new Airline("Moscow", 388, 'A', new Time(13, 30, 00), DayOfWeek.FRIDAY);
		airlines.add(al);
		al = new Airline("Minsk", 108, 'C', new Time(17, 40, 00), DayOfWeek.TUESDEY);
		airlines.add(al);
		al = new Airline("Warsaw", 212, 'B', new Time(06, 35, 00), DayOfWeek.THURSDAY);
		airlines.add(al);
		al = new Airline("Munchen", 408, 'B', new Time(21, 40, 00), DayOfWeek.SUNDAY);
		airlines.add(al);
		al = new Airline("Oslo", 170, 'B', new Time(23, 30, 00), DayOfWeek.WEDNESDAY);
		airlines.add(al);
		al = new Airline("Vilnius", 110, 'C', new Time(19, 10, 00), DayOfWeek.THURSDAY);
		airlines.add(al);
		al = new Airline("Deli", 750, 'A', new Time(10, 00, 00), DayOfWeek.SATURDAY);
		airlines.add(al);
		return airlines;

	}
}
