package javaproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(13);
        a1.add(14);
        a1.add(1);
        a1.add(0);
        System.out.println(a1);
        
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(11);
        a2.add(21);
        a2.add(113);
        a2.add(141);
        a2.add(11);
        a2.add(0);
        
        a2.addAll(a1);
        System.out.println(a2);
       System.out.println(a2.contains(150));
       
       System.out.println(a2);
      // System.out.println(a2.remove("113"));
       //a2.remove(113);
       System.out.println("traversing");
       for(int x: a2)
       {
    	  System.out.println(x); 
       }
       for(int i = 0 ; i < a2.size();i++)
       {
    	 System.out.println(a2.get(i));  
       }
      /* Iterator itr = a2.iterator(); //cursor [1,2,3,4]
       //iterator is universal cursor , can be used for all the collection classes
       
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }*/
       
       System.out.println("list iteraortor");
      ListIterator litr = a2.listIterator(a2.size()); //cursor [1,2,3,4]
       //iterator is universal cursor , can be used for all the collection classes
       
       while(litr.hasPrevious())
       {
    	   System.out.println(litr.previous());
       }
       
	}

}
