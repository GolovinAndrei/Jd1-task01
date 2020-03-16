package by.stech.les08.shape;

public class Triangle extends PlaneShape {

	private double angle;

	public Triangle() {
		super();

	}

	public Triangle(int hight, int width, double angle) {
		super(hight, width);
		this.angle = angle;

	}

	@Override
	public double square() {

		double square = 0.5 * getHight() * getWidth();
		return square;

	}

	public int seconSideOfTriangle() {

		int b = (int) (getHight() / Math.sin(this.angle));

		return b;

	}

	public int thirdSideOfTriangle (int b) {

		int c = (int) Math.sqrt( getWidth()* getWidth() + b * b - 2 * getWidth() * b * Math.cos(this.angle));

		return c;

	}

	public double perimetr(int b, int c) {

		int per = b + c + getWidth();
		return per;

	}

}
