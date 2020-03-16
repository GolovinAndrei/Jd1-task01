package by.stech.les9.state;

public class MapAction {

	public static void main(String[] args) {

		State gov = new State("Minsk", StateInput.regionAr(3));
		StateView sv = new StateView();

		sv.printCapital(gov);
		sv.printNumberOfRegions(gov);
		sv.printStateSquare(gov);
		sv.printRegionNames(gov);

	}

}
