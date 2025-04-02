package javaproject;
interface A
{
	void show();
}
/*class B implements A
{
	public void show()
	{
		System.out.println("hello");
	}
}*/
public class Lamex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* A ob = new B();
 ob.show();*/
 A ob = ()-> System.out.println("hi hello");
 ob.show();
	}

}
