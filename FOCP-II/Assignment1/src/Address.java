class Address
{
String line1;
String line2;
String city;
String state;
int pinCode;
Address()
{
	line1="Nil";
	line2="Nil";
	city="Nil";
	state="Nil";
	pinCode=0;
}
void adout()
{
	System.out.println("\nAddress : \n\t"+line1+"\n\t"+line2+"\n\t"+city+", "+state+"\n\t"+pinCode);
}
}
