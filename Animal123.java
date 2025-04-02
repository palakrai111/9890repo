package javaproject;
class Animal1
{
   String breed;
	Animal1(String breed)
	{
		System.out.println("i m in super class");
		this.breed = breed;
	}
	
}
class Dog1 extends Animal1
{
	int age;
	Dog1(String breed,int age)
	{
		super(breed);
		System.out.println("i ma in subclass");
		
		this.age = age;
	}
	
	void display()
	{
		System.out.println(breed + " "+ age);
	}
}
public class Animal123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 a = new Dog1("abc",18);
		a.display();
		
	}

}
