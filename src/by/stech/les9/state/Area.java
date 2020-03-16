package by.stech.les9.state;

public class Area {

	private String name;
	private City[] cities;

	public Area() {
	}

	public Area(String name, City[] cities) {
		this.name = name;
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

}
