package in.sp.backend;
import java.util.*;
public class secondpogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);	
		//person is eligible or not
		// char between a toz
		
		/*int a= 10;
		System.out.println(a++ + --a + ++a); // 10 + 10+11
		
		int b = 20;
		boolean x = (b>a)?true:false;
		System.out.println(x);
		
		int z = 8>>2;
		System.out.println("right shift"+z);
		int p = 8<<2;
		System.out.println("left shift"+p);*/
	
        
		System.out.println("enetr age");
		int age = sc.nextInt();
		
		System.out.println("enetr weight");

		int weight = sc.nextInt();
		if(age < 45 && weight < 65)
		{
			System.out.println("eligible for physcal test");
		}
		else
		{
			System.out.println("not eligible for physcal test");
		}
		System.out.println("enter char");
        char c = sc.next().charAt(0);
        if(c>= 'A' && c<='E')
        {
        	System.out.println("lies between a and e");
        }
        else
        {
        	System.out.println("does not lies between a and e");
        }
	}

}
