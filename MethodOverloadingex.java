package javaproject;

public class MethodOverloadingex {

	public static void main(String x)
	{
		System.out.println( " i am inside overloaded  main" + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i am inside main method");
		main("palak");
	}

}
