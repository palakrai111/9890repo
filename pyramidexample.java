package in.sp.backend;

public class pyramidexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <=5;i++)
		{
			for(int j=5; j>= i; j--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
		
		
		
		int x = 5;
	
		switch(x)
		{
		case 1: System.out.println("i am inside first case");
		break;
		case 2: System.out.println("i am inside first case");
		break;
		default:
			System.out.println("not valid case");
		
		}
		System.out.println("---z----");
        int z = 0;
		while(z<10)
		{
			if(z==5)
			{
				//break;
				continue;
			}
			System.out.println(z);
			z++;
		}
		int k = 10;
		System.out.println("do while");
		do
		{
			System.out.println(k);
			k++;
		}while(k<10);
		System.out.println("for loop");
		for(int l = 1; l < 10;l++)
		{
			if(l == 5)
			{
				break;
			}
			System.out.println(l);
		}
	}

}
// for loop iteration