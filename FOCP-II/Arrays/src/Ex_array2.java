import java.util.*;
class Ex_array2
{
	static public void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		int[] arr=new int[5];
		input(arr);
		int a,op;
		do
		{
			System.out.print("\n\n---Functions Menu---\n\n1.Show elements\n2.Show largest Number\n3.Show smallest number\n4.Show second largest number\n5.Sum of alt elements\n6.Count of even numbers\n7.Sum of all elements\n8.Occurence of particular element\n\nChoice - ");
			int ch=c.nextInt();
			switch(ch)
			{
				case 1:disp(arr);break;
				case 2:System.out.println("Largest number is "+lar1(arr));break;
				case 3:System.out.println("Smallest number is "+smal1(arr));break;
				case 4:System.out.println("Second largest number is "+lar2(arr));break;
				case 5:System.out.println("Sum of Alternate Elements is "+altsum(arr));break;
				case 6:System.out.println("Number of even elements is "+count(arr));break;
				case 7:System.out.println("Sum of all elements is "+sum(arr));break;
				case 8:{
						System.out.print("Enter number : ");
						op=c.nextInt();
						System.out.println("Occurence of given number is "+occ(arr,op));break;
					}
				default:System.out.println("Wrong Choice");
			}
			System.out.print("Do you wan to run the program again? Press 1");
			a=c.nextInt();
		}while(a==1);
	}
	static void input(int[] a)
	{
		Scanner con=new Scanner(System.in);
		System.out.println("Enter 5 elements - ");
		for(int i=0;i<5;i++)
		{
			a[i]=con.nextInt();
		}
	}
	static void disp(int[] a)
	{
		System.out.println("Elements entered in the array are - ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	static int sum(int[] a)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	static int lar1(int[] a)
	{
		int l=a[0];
		for(int i=0;i<5;i++)
		{
			if(l<a[i])
			{
				l=a[i];
			}
		}
		return l;
	}
	static int smal1(int[] a)
	{
		int s=a[0];
		for(int i=0;i<5;i++)
		{
			if(s>a[i])
			{
				s=a[i];
			}
		}
		return s;
	}
	static int lar2(int[] a)
	{
		int l;
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(a[i]<a[j])
				{
					l=a[i];
					a[i]=a[j];
					a[j]=l;
				}
			}
		}
		return a[1];
	}
	static int altsum(int[] a)
	{
		int sum=0;
		for(int i=0;i<5;i=i+2)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	static int count(int[] a)
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	static float occ(int[] a, int x)
	{
		float ch=0;
		for(int i=0;i<5;i++)
		{
			if(x==a[i])
			{
				ch++;
			}
		}
		ch=ch/5;
		return ch;
	}
}