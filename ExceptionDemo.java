package javaproject;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello welcome to java");
		try
		{
			String s = null;
			System.out.println(s.length());
			int arr[] = new int[5];
			arr[6] = 10;
		int x = 10/0;
		System.out.println("hello..");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	   
		finally
		   {
			   System.out.println("i am always executed");
		   }
		
		System.out.println("ends");

	}

}
