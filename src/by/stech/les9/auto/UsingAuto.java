package by.stech.les9.auto;

public class UsingAuto {

	public static void main(String[] args) {
		AutoAction action = new AutoAction ();
		Auto myCar = new Auto ("mechanical", 0, "bmw", new Engine(3000, 'g', false), action.startSetOfWhells("Summer", 18), 14, 80);
		action.printModel(myCar);
		myCar.getEng().setStarted(true);
		myCar.setSpeed(60);
		
		if (myCar.isMoving()) {
			System.out.println("Car is moving with speed "+myCar.getSpeed()+" km/h");
		}
		
		myCar.toStop();
		
		myCar.fillUpFuel(60);
		action.changeWheel(4, myCar, "Summer", 19);
		
	}

}
