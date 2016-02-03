package lesson3.labsolns.prob3;

public class CylinderComposition {
	private Circle circle;
	private double height;
	private double volume;
	public CylinderComposition() {
		
		circle = new Circle(1.0);
		height = 1.0;
		volume = circle.getArea() * height;
	}

	public CylinderComposition(double radius) {
		circle = new Circle(radius);
		
		this.height = 1.0;
		volume = circle.getArea() * height;
	}
	public CylinderComposition(double radius, double height)
	{
		circle = new Circle(radius);
		this.height = height;
		volume = circle.getArea() * height;
		
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		//As setVolume is not defined, volume calculation
		//is done in constructors for performance
		return volume;
	}

}
