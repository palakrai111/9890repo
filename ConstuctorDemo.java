package javaproject;

public class ConstuctorDemo 
{
	int id;
	String name;
	String githublink;
	
	ConstuctorDemo(int id , String name)
	{
		id =id;
		name = name;
		System.out.println("first const");
	}
	ConstuctorDemo(int id , String name,String githublink)
	{
		this(id,name);
	githublink = githublink;
	}
    void display()
    {
    	System.out.println(id + name + githublink);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstuctorDemo ob1 = new ConstuctorDemo(1,"palak");
		ob1.display();
		ConstuctorDemo ob = new ConstuctorDemo(1,"palak","paakra101");
		ob.display();
	}

}
