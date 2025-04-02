package javaproject;

public class staticdemo1 {

	static int x = 10;
	static int y;
	static
	{
		System.out.println("static block starts");
		y = 20;
	}
	static void display()
	{
	//	show();
	    System.out.println("i m inside static method" + y);	
	}
	void show()
	{
		//display();
		System.out.println("i m non static ethod" + y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticdemo1 ob = new staticdemo1();
		ob.show();
		display();
		System.out.println("main maind ends");
		
		
	}

}
