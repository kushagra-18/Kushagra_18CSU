import java.util.*;
class Ex6_Q4
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter Number of terms : ");
		int a=con.nextInt();
		char ch;
		for(int i=1;i<=a;i++)
		{
			for(int z=1;z<=(a-i);z++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				ch=(char)(64+j);
				System.out.print(ch);
			}
			for(int j=i-1;j>=1;j--)
			{
				ch=(char)(64+j);
				System.out.print(ch);
			}
			System.out.print("\n");
		}
		for(int i=1;i<a;i++)
		{
			for(int z=1;z<=i;z++)
				System.out.print(" ");
			for(int j=1;j<=(a-i);j++)
			{
				ch=(char)(64+j);
				System.out.print(ch);
			}
			for(int j=(a-i-1);j>=1;j--)
			{
				ch=(char)(64+j);
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
}