package by.stech.les9.auto;

public class Wheel {

	private int radius;
	private String season;

	public Wheel() {

	}

	public Wheel(int radius, String season) {

		this.radius = radius;
		this.season = season;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
