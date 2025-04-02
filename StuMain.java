package javaproject;

import java.util.Scanner;

public class StuMain {
 int id;
 String name;
	/*StuMain(int id,String name)
	{
		this.id = id;
		this.name = name;
	}*/
	void insert()
	{
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		id = sc.nextInt();
		
	}
	void display()
	{
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StuMain ob1 = new StuMain();
		//StuMain ob2 = new StuMain();
		
		StuMain as[] = new StuMain[2];
		//as[0] = ob1;
		//as[1] = ob2;
		for(int i = 0; i < 2; i++)
		{
			StuMain ob1 = new StuMain();
			as[i] = ob1;
			as[i].insert();
		}
		
		for(int i = 0; i < 2; i++)
		{
			as[i].display();
		}
	}

}
