package javaproject;

public class Employee {

	int id;
	String name;
	String sname;
		Employee()
		{
		 System.out.println("hello world");	
		}
		 Employee(int id , String name)
		   {
			   this();
			  this.id = id;
			  this.name = name;
			 
		   }
	   Employee(int id , String name,String sname)
	   {
		   this(id,name);
		 
		  this.sname = sname;
	   }
	   void display()
	   {
		  System.out.println(id + " "+name + " " + sname);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee(1,"abc","mmm");
		
		ob.display();
	}

}
