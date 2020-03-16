package by.stech.les9.auto;

public class Auto extends Vehicle {

	public String model;
	private Engine eng;
	private Wheel[] wheels;
	private int fuelAmount;
	private int fuelTankVolume;

	public Auto() {

	}

	public Auto(String type, double speed, String model, Engine eng, Wheel[] wheels, int fuelAmount,
			int fuelTankVolume) {
		super(type, speed);
		this.model = model;
		this.eng = eng;
		this.wheels = wheels;
		this.fuelAmount = fuelAmount;
		this.fuelTankVolume = fuelTankVolume;
	}

	@Override
	public boolean isMoving() {
		if (this.getSpeed() != 0 && this.getEng().isStarted() && this.fuelAmount != 0) {
			return true;
		} else {
			return false;
		}
	}

	public void toStop() {
		if (this.getSpeed() != 0) {
			this.setSpeed(0.00);
		}
	}

	public void fillUpFuel(int fillingFuelAmount) {
		char typeOfFuel = this.getEng().getTypeOfFuel();
		if (isMoving()) {
			System.out.println("Car is moving!! Yoy have to stop it!");
			return;
		}
		int newFuelAmount = this.fuelAmount + fillingFuelAmount;
		if (newFuelAmount > this.fuelTankVolume) {
			newFuelAmount = this.fuelTankVolume;
			System.out.println("To much fuel!!");
		}
		System.out.println("Filled with " + typeOfFuel + "-fuel: " + (newFuelAmount - this.fuelAmount));
		this.fuelAmount = newFuelAmount;

		return;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public int getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(int fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public int getFuelTankVolume() {
		return fuelTankVolume;
	}

	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}

}
