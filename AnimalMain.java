package javaproject;

class Animal
{
	int x = 10;
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	int x = 20;
	void weep()
	{
		System.out.println("dog is weeping" + x);
	}
}
class Cat extends Animal
{
	int x = 20;
	void weep()
	{
		System.out.println("cat is weeping" + x);
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.weep();
		Cat c = new Cat();
		c.eat();
		c.weep();
		
		
	}

}
