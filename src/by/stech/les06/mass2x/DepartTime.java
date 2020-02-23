package by.stech.les06.mass2x;

public class DepartTime {

	private String month;
	private int day;
	private int hour; 
	private int min; 

	
	public DepartTime (String month, int day, int hour, int min) {
		this.month=month;
		this.day=day;
		this.hour=hour;
		this.min=min;
	}
	
	
	public String getMonth() {
		return month;
		
	}

	public int getDay() {
		return day;
	}	

	public int getHour() {
		return hour;
	
	}
	
	public int getMin() {
		return min;
	
	}
	

	
}
