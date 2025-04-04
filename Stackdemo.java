package javaproject;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack s = new Stack();
   s.push(5);
   s.push(50);
   s.push(59);
   s.push(15);
   s.pop();
   s.pop();
   System.out.println(s);
   System.out.println(s.peek());
   
   
		
	}

}
