package javaproject;

public class ThrowExample {
	
	


	
	static void validateAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("age is not valid");
		}
		else
		{
			System.out.println("age is valid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validateAge(-15);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}

}



