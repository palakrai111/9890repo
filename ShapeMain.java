package javaproject;
abstract class shape
{
	shape()
	{
		System.out.println( "i am insdie Shape constructor");
	}
	abstract void draw();
	void show()
	{
		System.out.println("i am inside abstract class");
	}


}
class circle extends shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle is drawing");
	}
	
}
class square extends shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("square is drawing");
	}
	
}


public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle c = new circle();
		c.draw();
		c.show();
		square q = new square();
		q.draw();
	}

}
