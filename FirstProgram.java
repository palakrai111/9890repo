package in.sp.backend;
import java.util.*;
public class FirstProgram {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hello world");
		int sum = 0;
		for(int i = 1; i <=5;i++)
		{
			sum = sum+ i;
		}
		System.out.println(sum);
		
		int no = 10;
		if(no > 1 && no <10)
		{
			System.out.println("no is within the range");
		}
		else
		{
			System.out.println("no is not within the range");
		}
		if(no % 2 == 0)
		{
			System.out.println("even no");
		}
		else
		{
			System.out.println("odd no");
		}
		
         System.out.println("enter name");
         String name = sc.next();
         System.out.println(name);
         
         System.out.println("enter age");
         int age = sc.nextInt();
         System.out.println(age);
         
         System.out.println("enter salary");
         float salary = sc.nextFloat();
         System.out.println(salary);
		
         System.out.println("enter character");
         char c = sc.next().charAt(0);
         System.out.println(c);
	}

}
