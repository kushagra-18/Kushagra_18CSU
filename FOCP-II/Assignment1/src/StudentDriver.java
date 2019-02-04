import java.util.*;
import java.io.*;
class StudentDriver
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		String firstName,lastName,eMail,contactNo;
		String[] skills;
		int day,month,year;
		int nres=0;
		Address addr=new Address();
		System.out.print("Enter First Name : ");
		firstName=con.nextLine();

		System.out.print("Enter Second Name : ");
		lastName=con.nextLine();

		System.out.print("\n\nEnter Address : \nLine 1 - ");
		addr.line1=con.nextLine();
		System.out.print("Line 2 - ");
		addr.line2=con.nextLine();
		System.out.print("City : ");
		addr.city=con.nextLine();
		System.out.print("State : ");
		addr.state=con.nextLine();
		System.out.print("Pincode : ");
		addr.pinCode=con.nextInt();

		System.out.print("\nEnter Date of Birth - \nDay : ");
		day=con.nextInt();
		System.out.print("Month : ");
		month=con.nextInt();
		System.out.print("Year : ");
		year=con.nextInt();
		DATE dob=new DATE(day,month,year);

		System.out.print("\nEnter number of skills : ");
		int nskill=con.nextInt();
		con.nextLine();
		skills=new String[nskill];
		System.out.println("Enter Skills - ");
		for(int i=0;i<nskill;i++)
		{
			skills[i]=con.nextLine();
		}

		System.out.print("\nEnter number of Qualifications : ");
		int nqual=con.nextInt();
		con.nextLine();
		Qualification[] qual=new Qualification[nqual];
		for(int i=0;i<nqual;i++)
		{
			qual[i]=new Qualification();
			System.out.print("\nQualification : ");
			qual[i].qualName=con.nextLine();
			System.out.print("University : ");
			qual[i].university=con.nextLine();
			System.out.print("Institute : ");
			qual[i].institute=con.nextLine();
			System.out.print("CGPA : ");
			qual[i].cgpa=con.nextInt();
			con.nextLine();	
		}

		System.out.print("\nEnter number of Projects you made - ");
		int npro=con.nextInt();
		con.nextLine();
		Project[] projects=new Project[npro];
		for(int i=0;i<npro;i++)
		{
			projects[i]=new Project();
			System.out.print("\nEnter Project Name : ");
			projects[i].name=con.nextLine();
			System.out.print("Start date - \nDay : ");
			projects[i].startDate.day=con.nextInt();
			System.out.print("Month : ");
			projects[i].startDate.month=con.nextInt();
			System.out.print("Year : ");
			projects[i].startDate.year=con.nextInt();
			System.out.print("End date - \nDay : ");
			projects[i].endDate.day=con.nextInt();
			System.out.print("Month : ");
			projects[i].endDate.month=con.nextInt();
			System.out.print("Year : ");
			projects[i].endDate.year=con.nextInt();
			con.nextLine();
			System.out.print("Your Role in the Project : ");
			projects[i].role=con.nextLine();
			System.out.print("How many responsibilities did you have : ");
			nres=con.nextInt();
			con.nextLine();
			projects[i].responsibilities=new String[nres];
			System.out.println("Enter Responsibilities - ");
			for(int j=0;j<nres;j++)
				projects[i].responsibilities[j]=con.nextLine();
		}

		System.out.print("\nEnter your Email Id : ");
		eMail=con.nextLine();

		System.out.print("Enter your Contact Number : ");
		contactNo=con.nextLine();

		Student stu;
		System.out.print("Do you want to see student info? If yes Press 1 - ");
		int x=con.nextInt();
		if(x==1)
		{
			if(npro>0)
			{
			stu=new Student(firstName,lastName,addr,dob,skills,qual,projects,eMail,contactNo);
			stu.stuout(nskill,nqual,npro,nres);
			}

			else
			{
			stu=new Student(firstName,lastName,addr,dob,skills,qual,eMail,contactNo);
			stu.stuout2(nskill,nqual);
			}
			System.out.println("\n\nThank you for using my progarm.\nMade by LAKSHAY GOYAL");
		}
		else
			System.out.println("\n\nThank you for using my progarm.\nMade by LAKSHAY GOYAL");
	}
}