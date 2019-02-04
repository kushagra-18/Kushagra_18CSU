import java.util.*;
class Ex5_Q3
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter first number : ");
		double a=con.nextDouble();
		System.out.print("Enter second number : ");
		double b=con.nextDouble();
		a=a*1000;
		b=b*1000;
		a=Math.floor(a);
		b=Math.floor(b);
		if(a==b)
			System.out.println("\nNumbers are same upto 3 decimal places");
			else
			System.out.println("\nNumbers are not same");	}
}