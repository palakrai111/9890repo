package javaproject;

public class calcarea {
	int a;
	int b;
	public void insert(int a, int b)
	{
		this.a= a;
		this.b = b;
	
	}

	
	public int area()
	{
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcarea ob = new calcarea();
		ob.insert(5,4);
		System.out.println(ob.area());
				
		//bank app  // acept and display // max out f 2 nos // passing array
	}

}
