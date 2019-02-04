import java.util.*;
class Ex5_Q4
{
	static public void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		int no,cc;
		int check;
		int[] a=new int[5];
		do
		{
		System.out.print("Enter a 5 digit number : ");
		do{
		check=0;
		no=c.nextInt();
		for(int i=0;i<5;i++)
		{
			a[i]=no%10;
			if(no==0)
			{
				System.out.print("Entered number is less than 5 digits :( \nEnter number again : ");
				check=1;
				break;
			}
			no=no/10;
		}
		}while(check==1);
		for(int i=4;i>=0;i--)
		{
			System.out.print(a[i]+"   ");
		}
		System.out.print("\n\nWant to run program again? Press 1");
		cc=c.nextInt();
	}while(cc==1);
	}
}