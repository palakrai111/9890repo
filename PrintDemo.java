package javaproject;

class Printexample implements showable,Printable2
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//x = x+10;
		System.out.println("hello i am showting" + x);
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("i am inside view" + x);
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

	
	

}
public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printexample ob = new Printexample();
		ob.show();
		ob.view();
	}

}
