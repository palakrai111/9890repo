package javaproject;

public class CarDemo {
	Enginedemo e;
	CarDemo(Enginedemo e)
	{
		this.e = e;
	}
	void work()
	{
		e.startengine();
		System.out.println("car stared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enginedemo e = new Enginedemo();
		CarDemo ob = new CarDemo(e);
		ob.work();

	}

}
