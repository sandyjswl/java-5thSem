
import java.util.Scanner;

class Employees
{
	String empcode;
	String name;
	String add;
	Employees(String empcode, String name, String add)
	{
		this.empcode=empcode;
		this.name=name;
		this.add=add;

	}
	void display()
	{
		System.out.println("The Employee Code is "+empcode);
		System.out.println("The Employee Name is "+name);
		System.out.println("The Employee Address is "+add);
	}

}

class Scientist extends Employees
{

	String subject;
	String publication;
	int nofproject;
	String typeofproject;
	
	Scientist(String empcode, String name, String add,String s, String p, int n, String t)
	{
		super(empcode,name,add);
		subject=s;
		publication=p;
		nofproject=n;
		typeofproject=t;

	}
	
	void display()
	{
		super.display();
		System.out.println("The Scientist Subject is "+subject);
		System.out.println("The Scientist Publication is "+publication);		
		System.out.println("The Scientist Type of project is "+typeofproject);
		System.out.println("The Scientist Type of project is "+nofproject);
		
	}

}

class Engineer extends Employees
{

	int sw;
	//int hw;	
	Engineer(String empcode, String name, String add,int sw)
	{
		super(empcode,name,add);
		//sw=s;
		this.sw=sw;
	}



	void display()
	{
		super.display();
		System.out.println("The Engineer Income is "+sw);
		
	}


}


class Worker extends Employees
{

	String machine;
	String type;

	Worker(String empcode, String name, String add,String m, String t)
	{
		super(empcode,name,add);
		machine=m;
		type=t;
	}
	
	void display()
	{
		System.out.println("The Regular Worker Machine is "+machine);
		System.out.println("The Regular Worker Machine Type is "+type);
	}


	

}	

class Regular extends Worker
{
	int basic;
	Regular(String empcode, String name, String add,String m, String t,int b)
	{
		super(empcode,name,add,m,t);
		basic=b;
	}


	void display()
	{
		super.display();
		System.out.println("The Regular Worker Basic Salary is "+basic);
		
	}
	
}

class DailyWage extends Worker
{

	int wage;
	DailyWage(String empcode, String name, String add,String m, String t,int w)
	{
		super(empcode,name,add,m,t);
		wage=w;
	}
	
	void display()
	{
		super.display();
		System.out.println("The Daily Wage Worker Basic Salary is "+wage);
		
	}
	

}

class Database
{
	public static void main(String args[])
	{
		System.out.println("Enter the Employee Code, Name and Address:");
		Scanner sc=new Scanner(System.in);
		
		
		String empcode=sc.next();
		String name=sc.next();
		String address=sc.next();
		
		System.out.println("Choose the Type of Employee:\n");
		System.out.println("1.Scientist\n2.Engineer\n3.Regular Worker\n4.Daily Wage Worker");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
				System.out.println("Enter Subject, Publication, No of Project, Type of project");
				String subject=sc.next();
				String publication=sc.next();
				int noproject=sc.nextInt();
				String type=sc.next();
				Scientist object=new Scientist(empcode,name,address,subject,publication,noproject,type);
				object.display();
				break;
			case 2:
				System.out.println("Enter Income");
				int income=sc.nextInt();
				
				Engineer object1=new Engineer(empcode,name,address,income);
				object1.display();
				break;
			case 3:
				System.out.println("Enter Machine,Type,Basic Income");
				String machine=sc.next();
				String type1=sc.next();
				int income1=sc.nextInt();
				Regular object2=new Regular(empcode,name,address,machine,type1,income1);
				object2.display();
				break;
			case 4:
				System.out.println("Enter Machine");
				String machine1=sc.next();
				String type3=sc.next();
				int inc=sc.nextInt();
				Regular object3=new Regular(empcode,name,address,machine1,type3,inc);
				object3.display();
				break;



				

		}
		
		
		
		
		
		
		

		
				

	}


}

