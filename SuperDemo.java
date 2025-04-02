package javaproject;

class Bike123
{
	int speedlimit = 150;
	void display()
	{
		System.out.println("hii i am inside super class");
	}
}
class Honda123 extends Bike123
{
	int speedlimit = 250;
	void dispaly()
	{
		super.display();
		System.out.println(speedlimit);
		System.out.println(super.speedlimit);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda123 b = new Honda123();
		b.dispaly();
	}

}
