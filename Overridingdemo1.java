package javaproject;

class Animals
{
	static void display()
	{
		System.out.println("I am an animal");
	}
}
class Dog1234 extends Animals
{
	static void display()
	{
		System.out.println("I am a dog");
	}
}
class Cat1234 extends Animals
{
	static void display()
	{
		System.out.println("I am a cat");
	}
}

public class Overridingdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals d;
       d=new Dog1234();
      d.display();
       d=new Cat1234();
      d.display();
	}

}
