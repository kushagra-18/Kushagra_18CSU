import java.util.*;
class Ex6_Q1
{
	static public void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n=c.nextInt();
		System.out.print("Enter value of x : ");
		int x=c.nextInt();
		int sum=1,ch=1;
		for(int i=1;i<n;i++)
		{
			ch=ch*x/i;
			sum=sum+ch;
		}
		System.out.println("\nSum of series is "+sum);
	}
}