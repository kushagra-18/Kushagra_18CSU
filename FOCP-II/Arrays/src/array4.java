import java.util.*;
class array4
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter size of first array : ");
		int l1=con.nextInt();
		int[] arr1=new int[l1];
		System.out.println("Enter elements in first array - ");
		int i;
		for(i=0;i<l1;i++)
		{
			arr1[i]=con.nextInt();
		}
		System.out.print("Enter size of second array : ");
		int l2=con.nextInt();
		int[] arr2=new int[l2];
		System.out.println("Enter elements in first array - ");
		for(i=0;i<l2;i++)
		{
			arr2[i]=con.nextInt();
		}
		int[] arr3=new int[l1+l2];
		for(i=0;i<l1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(i=l1;i<(l1+l2);i++)
		{
			arr3[i]=arr2[i-l1];
		}
		int ch;
		for(i=0;i<(l1+l2);i++)
		{
			for(int j=i;j<(l1+l2);j++)
			{
				if(arr3[j]<arr3[i])
				{
					ch=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=ch;
				}
			}
		}
		System.out.println("Here is the new array - ");
		for(i=0;i<(l1+l2);i++)
		{
			System.out.println(arr3[i]);
		}
	}
}