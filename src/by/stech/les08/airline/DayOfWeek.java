package by.stech.les08.airline;

public enum DayOfWeek {
	MONDEY("monday"), TUESDEY("tuesdey"), WEDNESDAY("wednesday"), THURSDAY("thursday"), FRIDAY("friday"),
	SATURDAY("saturday"), SUNDAY("sunday");

	private String dayName;

	private DayOfWeek(String dayName) {
		this.dayName = dayName;
	}

	public String getDayOfWeek() {
		return dayName;
	}

}
