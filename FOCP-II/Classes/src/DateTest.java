import java.util.*;
class Date
{
	int day;
	int month;
	int year;
	Date()
	{
		day=1;
		month=1;
		year=2000;
	}
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void displayDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
}
class DateTest
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		Date c1=new Date();
		System.out.println("Default values set by computer ---");
		c1.displayDate();
		System.out.print("\nEnter Day : ");
		int day=con.nextInt();
		System.out.print("Enter Month : ");
		int month=con.nextInt();
		System.out.print("Enter Year : ");
		int year=con.nextInt();
		Date c2=new Date(day,month,year);
		c2.displayDate();
	}
}