package by.stech.les9.state;

public class StateView {

	
	public void printCapital (State state) {
		
		System.out.println(state.getCapital());
		return;
	}
	
	public void printStateSquare (State state) {
		double square=0;
		for (Region r:state.getRegions()) {
			square+=r.getRegionSquare();
		}
		System.out.println("Common square is "+square);
		return;
	}
	
	public void printNumberOfRegions (State state) {
	
		 int number = state.getRegions().length;
		
		System.out.println("Number of regions is "+number);
		return;
	}
	
	public void printRegionNames (State state) {
		
		for (Region r:state.getRegions()) {
			System.out.println(r.getRegionalCenter());
		}
		
		return;
	}
	
	
}
