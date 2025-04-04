package javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(5);
		hs.add(2);
		hs.add(2);
		hs.add(null);
		System.out.println(hs);
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(5);
		hs1.add(2);
		hs1.add(2);
		hs1.add(null);
		System.out.println(hs1);
		TreeSet<Integer> hs2 = new TreeSet<Integer>();
		hs2.add(10);
		hs2.add(20);
		hs2.add(5);
		hs2.add(2);
		hs2.add(2);
		//hs2.add(null);
		System.out.println(hs2);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(13);
		a1.add(5);
		a1.add(3);
		a1.add(2);
		Collections.sort(a1);
		System.out.println(Collections.min(a1) + " "+ Collections.max(a1));
		System.out.println("sorted");
		System.out.println(a1);

	}

}
