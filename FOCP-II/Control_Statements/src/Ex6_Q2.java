import java.util.*;
class Ex6_Q2
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		String a;
		a=con.nextLine();
		int len;
		len=a.length();
		if(len==1)
		{
			if(a.equalsIgnoreCase("A")||a.equalsIgnoreCase("E")||a.equalsIgnoreCase("I")||a.equalsIgnoreCase("O")||a.equalsIgnoreCase("U"))
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
		}
		else 
			System.out.println("More than one Character entered");
	}
}