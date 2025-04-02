package javaproject;
class Bike
{
	int speedlimit = 150;
}
class Honda extends Bike
{
	int speedlimit = 150;
}
public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Honda();
	System.out.print(b.speedlimit);
	}

}
// super,final,abstraction,polymorphism