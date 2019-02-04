class Student
{
String firstName;
String lastName;
Address addr;
DATE dob;
String[] skills;
Qualification[] qual;
Project[] projects;
String eMail;
String contactNo;
Student()
{
	firstName="Nil";
	lastName="Nil";
	skills=new String[1];
	skills[0]="Nil";
	qual=new Qualification[1];
	qual[0]=new Qualification();
	projects=new Project[1];
	projects[0]=new Project();
	eMail="Nil";
	contactNo="0000000000";
}
Student(String firstName,String lastName,Address addr,DATE dob,String[] skills,Qualification[] qual,Project[] projects,String eMail,String contactNo)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.addr=addr;
	this.dob=dob;
	this.skills=skills;
	this.qual=qual;
	this.projects=projects;
	this.eMail=eMail;
	this.contactNo=contactNo;
}
Student(String firstName,String lastName,Address addr,DATE dob,String[] skills,Qualification[] qual,String eMail,String contactNo)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.addr=addr;
	this.dob=dob;
	this.skills=skills;
	this.qual=qual;	
	this.eMail=eMail;
	this.contactNo=contactNo;
}
void stuout(int sn,int qn,int pn,int rn)
{
	System.out.println("--- STUDENT INFO ---");
	System.out.println("\nFirst Name : "+firstName);
	System.out.println("Last Name : "+lastName);
	addr.adout();
	System.out.print("Date of Birth : ");dob.daout();
	System.out.println("\n\nSkills : ");
	for(int i=0;i<sn;i++)
		System.out.println(skills[i]);
	System.out.print("\n");
	for(int i=0;i<qn;i++)
		qual[i].qaout();
	System.out.print("\n");
	for(int i=0;i<pn;i++)
		projects[i].prout(rn);
	System.out.println("\nEmail Id : "+eMail);
	System.out.println("Contact Number : "+contactNo);
}
void stuout2(int sn,int qn)
{
	System.out.println("--- STUDENT INFO ---");
	System.out.println("\nFirst Name : "+firstName);
	System.out.println("Last Name : "+lastName);
	addr.adout();
	System.out.print("Date of Birth : ");dob.daout();
	System.out.println("\n\nSkills : ");
	for(int i=0;i<sn;i++)
		System.out.println(skills[i]);
	System.out.print("\n");
	for(int i=0;i<qn;i++)
		qual[i].qaout();
	System.out.println("\nEmail Id : "+eMail);
	System.out.println("Contact Number : "+contactNo);
}
}