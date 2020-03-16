package by.stech.les08.shape;

public class PlaneShape {

	private int hight;
	private int width;

	public PlaneShape() {
	}

	public PlaneShape(int hight, int width) {

		this.hight = hight;
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double square() {

		double square = hight * width;
		return square;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlaneShape other = (PlaneShape) obj;
		if (hight != other.hight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}
