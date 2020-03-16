package by.stech.les08.airline;

import by.stech.les08.time.Time;

public class Airline {

	
	private String distPoint;
	private int flightNumber;
	private char planeType;
	private Time time;
	private DayOfWeek day;
	

	public Airline () {

	}


	public Airline(String distPoint, int flightNumber, char planeType, Time time, DayOfWeek day) {
	
		this.distPoint = distPoint;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.time = time;
		this.day = day;
	}


	public String getDistPoint() {
		return distPoint;
	}


	public void setDistPint(String distPoint) {
		this.distPoint = distPoint;
	}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public char getPlaneType() {
		return planeType;
	}


	public void setPlaneType(char planeType) {
		this.planeType = planeType;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public DayOfWeek getDay() {
		return day;
	}


	public void setDay(DayOfWeek day) {
		this.day = day;
	}


	@Override
	public String toString() {
		return "Airline [distPint=" + distPoint + ", flightNumber=" + flightNumber + ", planeType=" + planeType
				+ ", time=" + time + ", day=" + day + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((distPoint == null) ? 0 : distPoint.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + planeType;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (day != other.day)
			return false;
		if (distPoint == null) {
			if (other.distPoint != null)
				return false;
		} else if (!distPoint.equals(other.distPoint))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (planeType != other.planeType)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
	
}
