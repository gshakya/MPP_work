package lesson3.labsolns.prob3;

public class CylinderInherit extends Circle {
	private double height;
	private double volume;
	public CylinderInherit() {
		
		super(1.0);
		height = 1.0;
		volume = getArea() * height;
	}

	public CylinderInherit(double radius) {
		super(radius);
		
		this.height = 1.0;
		volume = getArea() * height;
	}
	public CylinderInherit(double radius, double height)
	{
		super(radius);
		this.height = height;
		volume = getArea() * height;
		
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
