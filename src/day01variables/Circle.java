package day01variables;

public class Circle extends GeoObj {

	@Override
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	

}
