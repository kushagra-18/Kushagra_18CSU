import java.util.*;
class Circle 
{
	double radius;
	Circle()
	{
		radius=1;
	}
	Circle(double a)
	{
		radius=a;
	}
	double area()
	{
		return radius*radius*3.14;
	}
	double circumference()
	{
		return 2*3.14*radius;
	} 
	void display()
	{
		System.out.println("Area of Circle is "+area()+"\nCircumference of Circle is "+circumference());
	}
}
class CircleTest
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.println("Default values set by System --- ");
		Circle c1=new Circle();
		c1.display();
		System.out.print("\nEnter radius : ");
		Double rad=con.nextDouble();
		Circle c2=new Circle(rad);
		c2.display();
	}
}