package by.stech.les9.auto;

public class AutoAction {

	public void changeWheel (int countOfCahingWheels, Auto auto, String season, int radius) {
		Wheel[] wheel=auto.getWheels(); 
		for (int i=0; i<countOfCahingWheels; i++) {
			
			wheel[i].setRadius(radius);
			wheel[i].setSeason(season);
			
		}
		
	return;	
			
	}
	
	public Wheel [] startSetOfWhells ( String season, int radius) {
		Wheel[] wheel=new Wheel[4]; 
		
		for (int i=0; i<4; i++) {
			wheel[i]=new Wheel (radius, season);
			
		}
		
	return wheel;	
	}
	
	public void printModel (Auto auto) {
		System.out.println("Model of the car: " + auto.getModel());
	return;
	}
	
	
}
