package javaproject;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<StudentArrayList> a1 = new ArrayList<StudentArrayList>();
		StudentArrayList ob1 = new StudentArrayList(1,"palak");
		StudentArrayList ob2 = new StudentArrayList(2,"gagan");
		StudentArrayList ob3 = new StudentArrayList(3,"nayan");
		a1.add(ob1);
		a1.add(ob2);
		a1.add(ob3);
		for(StudentArrayList s : a1)
		{
			System.out.println(s);
		}
		
		
	}

}
