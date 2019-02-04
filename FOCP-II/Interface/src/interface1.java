interface GeometricObject
{
	double getPerimeter();
	double getArea();
}
interface Resizable
{
	void resize(int percent);
} 
class Circle implements GeometricObject
{
	double radius=1.0;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
class ResizableCircle extends Circle implements Resizable
{
	void ResizableCircle(double radius)
	{
		super(radius);
	}
	void resize(int percent)
	{
	}
}