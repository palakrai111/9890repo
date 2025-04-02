package javaproject;

public class Invalidage {

	static void valiadateAge(int age) throws AgeNotValidException
	{
		if(age < 18)
		{
			throw new AgeNotValidException("age not valid to vote");
		}
		else
		{
			System.out.println("age is valid to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		valiadateAge(15);
		}catch(AgeNotValidException e)
		{
		   System.out.println(e.getMessage());
		}
		
		System.out.println("gracefull termination");
		
	}

}
