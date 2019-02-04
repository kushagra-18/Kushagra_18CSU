class Project
{
		String name;
		DATE startDate;
		DATE endDate;
		String role;
		String [] responsibilities;
	Project()
		{
			this.name="Nil";
			startDate=new DATE(1,1,2019);
			endDate=new DATE(2,1,2019);
			role=("Nil");
			responsibilities=new String[1];
			responsibilities[0]="Nil";
		}
 		void prout(int r)
		{
			System.out.println("Project Name : "+name);
			System.out.print("Start Date : ");startDate.daout();
			System.out.print("\nEnd Date : ");endDate.daout();
			System.out.println("Role : "+role);
			System.out.print("Responsibilities : ");
			for(int i=0;i<r;i++)
				System.out.println(responsibilities[i]);
		}
}