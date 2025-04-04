package javaproject;

import java.util.ArrayList;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(15);
		a1.add(20);
		a1.add(5);
		int a[] = new int[a1.size()];
		int i;
		/*for(int x: a1)
		{
			a[i]=x;
			i++;
		}*/
		
		for(i = 0; i < a.length;i++)
		{
			a[i]=a1.get(i);
		}
		for(int y : a)
		{
			System.out.println(y);
		}
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		int b[] = new int[3];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		for(i = 0; i < b.length;i++)
		{
		    b1.add(b[i]);
		}
		System.out.println(b1);
	}

}
