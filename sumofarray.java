package javaproject;

public class sumofarray {
	
	int sumOfArrayElements(int marks1[])
	{int sum = 0;
	  for(int x : marks1)
	  {
		  sum = sum + x;
	  }
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofarray ob = new sumofarray();
		int marks[] = {10,20,30};
		int y = ob.sumOfArrayElements(marks);
		System.out.println("sum is :  "+y);

	}

}
