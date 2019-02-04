class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
Qualification()
{
	qualName="Nil";
	university="Nil";
	institute="Nil";
	cgpa=0;
}
void qaout()
{
	System.out.println("Qualification : "+qualName);
	System.out.println("University : "+university);
	System.out.println("Institute : "+institute);
	System.out.println("Cgpa = "+cgpa);
}
}
