class Details{


	String name;
	String gen;
	int age,sal;

	void input(String n, String g, int a, int s)
	{	
		name=n;
		gen=g;
		age=a;
		sal=s;
		
	}

	void display(){

	System.out.println("Name= "+name+" Gender= "+gen+" Age= "+age+" Salary= "+sal);

	}

}



class Gender{

	public static void main(String args[]){
		
		String name=args[0];
		String gen=(args[1]);
		int age= Integer.parseInt(args[2]);
		int salary=Integer.parseInt(args[3]);
		Details obj=new Details();
		obj.input(name,gen,age,salary);		
		obj.display();		
	
	}
}
