package javaproject;
//ca has a engine
public class Car {
	Engine e;
	public Car(Engine e)
	{
		this.e = e;
	}

	void start() 
	{
		e.work();
		System.out.println("car started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine();
		Car c= new Car(e);
		c.start();
				
		
		
	}

}
