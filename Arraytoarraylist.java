package javaproject;

import java.util.ArrayList;

public class Arraytoarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[3];
		ar[0] =1 ;
		ar[1] =2 ;
		ar[2] =3 ;
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		  for(int i = 0; i < ar.length;i++)
		  {
			 a1.add(ar[i]) ;
		  }
		  System.out.println("araylist");
		  for(int x: a1)
		  {
			  System.out.print( x + " ");
		  }
	}

}
