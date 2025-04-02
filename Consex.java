package javaproject;

public class Consex {

	
	
		int id ;
		String name;
		Consex(int i, String n)
		{
			id = i;
			name = n;
			
		}
		void display()
		{
			System.out.println(id + " " + name);
			//System.out.println(i + " " + n);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consex ob = new Consex(1,"jj");	
		
        ob.display();
	}

}
