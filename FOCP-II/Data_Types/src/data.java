import java.util.*;
class data
{
	public static void main(String args[])
	{
		int sum,sub,mul,div,mod;
		Scanner console=new Scanner(System.in);
		int a=console.nextInt();
		int b=console.nextInt();
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("a is " + a + "\nb is " + b);
		System.out.println("sum is " + sum + "\nSubtraction is " + sub + "\nMultiplication is " + mul + "\nQuotient after division is " + div + "\nRemainder after division is "+mod);
	}
}