package javaproject;

import java.util.Scanner;

public class Studentexample {
	int id;
	String name;
	
	 void acceptinfo()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter name");
		 name = sc.nextLine();
		 System.out.println("enter id");
		 id = sc.nextInt();
		 
	 }
    void display()
    {
    	System.out.println(id + " "+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentexample ob[] = new Studentexample[3];
		
		/*Studentexample se1 = new Studentexample();
		Studentexample se2 = new Studentexample();
		Studentexample se3 = new Studentexample();
		ob[0] = se1;
		ob[1] = se2;
		ob[2] = se3;*/
		
		
		for(int i = 0 ; i < 3; i++)
		{
			Studentexample se = new Studentexample();
			ob[i] = se;
			ob[i].acceptinfo();
		}
		for(int i = 0 ; i < 3; i++)
		{
			
			ob[i].display();
		}
		
	}

}
