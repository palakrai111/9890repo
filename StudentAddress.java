package javaproject;

public class StudentAddress {
	int sid;
	String sname;
	Address a;
	public StudentAddress(int sid, String sname, Address a) {
	
		this.sid = sid;
		this.sname = sname;
		this.a = a;
	}

	 void display()
	 {
		 System.out.println(sid + " " + sname + " "+ a.city+ " "+a.state);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("vizag","AP");
		StudentAddress ob = new StudentAddress(1,"palak",a);
		Address a2 = new Address("hyd","AP");
		StudentAddress ob2 = new StudentAddress(2,"nayan",a2);
		ob.display();
		ob2.display();
				

	}

}
