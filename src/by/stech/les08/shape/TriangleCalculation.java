package by.stech.les08.shape;

public class TriangleCalculation {

	public static void main(String[] args) {

		Triangle triang = new Triangle(38, 18, 30.0);
		double square = triang.square();
		int secondSide = triang.seconSideOfTriangle();
		int thirdSide = triang.thirdSideOfTriangle(secondSide);

		double per = triang.perimetr(secondSide, thirdSide);

		System.out.println("Square: " + square + "\n" + "Perimetr: " + per);
	}

}
