import java.util.*;
class Box
{
	double height;
	double depth;
	double length;

	Box(int a,int b,int c)
	{
		height=a;
		depth=b;
		length=c;
	}

	Box()
	{
		height=5;
		depth=4;
		length=3;
	}

	double volume()
	{
		return height*depth*length;
	}
}
class BoxDemo1
{
	static public void main(String args[])
	{
		Box fig1=new Box(7,8,9);
		Box fig2=new Box();
		System.out.println("Volume of fig1 is "+fig1.volume());
		System.out.println("Volume of fig2 is "+fig2.volume());
	}
}