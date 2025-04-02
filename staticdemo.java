package javaproject;

public class staticdemo {
  static int x;
	static
	{
		System.out.println("static");
		 x = 10;
	}
	static void a()
	{
		System.out.println("Abc" + x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("mainmethod");
        a();
	}

}
