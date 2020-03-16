package by.stech.les9.auto;

public class Engine {

	private int volume;
	private char typeOfFuel;
	private boolean started;

	public Engine() {
	}

	public Engine(int volume, char typeOfFuel, boolean started) {
		this.volume = volume;
		this.typeOfFuel = typeOfFuel;
		this.started = started;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public char getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(char typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isStarted() {
		return started;
	}

}
