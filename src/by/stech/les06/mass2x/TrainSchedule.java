package by.stech.les06.mass2x;


public class TrainSchedule {

	
	public static void printNesseryTrain (Train[]train, DepartTime [] time, int number) {
		
		int TrainNnumber=0;
		for ( int i=0; i<train.length; i++) {
			TrainNnumber=train[i].getTrainNumber();
			if (TrainNnumber==number) {
				System.out.println("Distination: "+train[i].getDistName()+ "  Departure time: "+ "in " +time[i].getMonth()+ " on " +time[i].getDay()+ "  "+time[i].getHour() + "H "+time[i].getMin()+"min");
			}
		}
		return;
		
	}
	
}
