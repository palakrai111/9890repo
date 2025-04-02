package javaproject;

public class Salon {

	int count;
	String Sname;
	Cust1 c[];
	Salon(String Sname,Cust1 c[])
	{
		this.Sname = Sname;
		this.c =c;
	}
	void display()
	{
		System.out.println("salon name is"+Sname);
		System.out.println("customers");
		 count = 0;
		for(Cust1 x : c)
		{
			if(x != null)
			{
			System.out.println(x.name);
			count++;
			}
		 }
		
		
	}
	int getcountCust()
	{
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cust1 ob1 = new Cust1("abc");
		Cust1 ob2 = new Cust1("xyz");
		Cust1 ob3 = new Cust1("lll");
		Cust1 totalc[] = new Cust1[5];
		totalc[0] = ob1;
		totalc[1] = ob2;
		totalc[2] = ob3;
				
		Salon s = new Salon("happy",totalc);
		s.display();
		System.out.println("total count is  "+ s.getcountCust());
		
	}

}
