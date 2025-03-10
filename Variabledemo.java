package in.sp.backend;

public class Variabledemo {

	
	  int id ; //instance
	  String name;  //instance
	  static String company = "TMF"; //static
	  void show()
	  {
		  int x = 10;
		  System.out.println(id + " "+ name + x+company);
	  }
	  
	  void show2()
	  {
		  
		  System.out.println(id + " "+ name+company);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Variabledemo ob1 = new Variabledemo();
		ob1.id = 101;
		ob1.name = "palak";
		//ob1.company ="abc";
		ob1.show2();
		ob1.show();
		//System.out.println(ob1.id + " "+ob1.name+ " "+company  );
		
		
		Variabledemo ob2 = new Variabledemo();
		ob2.id = 102;
		ob2.name = "nayan";
		//System.out.println(ob2.id + " "+ob2.name+ " "+company  );
         ob2.show();
         ob2.show2();
	}

}
