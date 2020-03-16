package by.stech.les9.state;

public class State {

	private String capital;
	private Region []regions;
	
	public State() {
	}
	
	public State(String capital, Region[] regions) {
		this.capital = capital;
		
		this.regions = regions;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public Region[] getRegions() {
		return regions;
	}
	public void setRegions(Region[] regions) {
		this.regions = regions;
	}
	
	
	
	
	
}
