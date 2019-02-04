import java.util.*;
class Box
{
	double height,width,depth;
	void setDim()
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter Height : ");
		height=con.nextInt();
		System.out.print("Enter Width : ");
		width=con.nextInt();
		System.out.print("Enter Depth : ");
		depth=con.nextInt();
	}
	double volume()
	{
		return height*width*depth;
	}
}

class BoxDemo
{
	static public void main(String args[])
	{
	Box var=new Box();
	var.setDim();
	double vol=var.volume();
	System.out.print("Volume is "+vol);
	}
}