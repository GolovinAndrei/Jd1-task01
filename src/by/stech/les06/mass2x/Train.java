package by.stech.les06.mass2x;

public class Train {

	private String distName;
	private int trainNumber;
	private DepartTime departTime;

	public Train(String distName, int trainNumber, DepartTime departTime) {
		this.distName = distName;
		this.trainNumber = trainNumber;
		this.departTime = departTime;
	}

	public String getDistName() {
		return distName;

	}

	public int getTrainNumber() {
		return trainNumber;
	}

	
}
