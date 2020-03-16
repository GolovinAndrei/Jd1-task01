package by.stech.les9.state;

public class Region {

	private String regionalCenter;
	private double regionSquare;
	private String name;
	private Area [] areas;
	public Region() {
	}
	public Region(String regionalCenter, double regionSquare, String name, Area[] areas) {
		this.regionalCenter = regionalCenter;
		this.regionSquare = regionSquare;
		this.name = name;
		this.areas = areas;
	}
	public String getRegionalCenter() {
		return regionalCenter;
	}
	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
	public double getRegionSquare() {
		return regionSquare;
	}
	public void setRegionSquare(double regionSquare) {
		this.regionSquare = regionSquare;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Area[] getAreas() {
		return areas;
	}
	public void setAreas(Area[] areas) {
		this.areas = areas;
	}
	
	
}
