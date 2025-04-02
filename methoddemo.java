package javaproject;

public class methoddemo {

	
	 int greaterNo(int a, int b)
	 {
		if(a>b) 
		{
			System.out.println("a is greater");
			return a;
		}
		else
		{
			return 0;
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methoddemo ob = new methoddemo();
		int x =ob.greaterNo(10,20);
		System.out.println(x);
		
	}

}
