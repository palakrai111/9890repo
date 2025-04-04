package javaproject;

import java.util.HashSet;
import java.util.*;
public class ProductService 
{
	HashSet<Product> products;
   Scanner sc = new Scanner(System.in);
   Product p1 = new Product(102,"a");
   Product p2 = new Product(103,"b");
   Product p3 = new Product(104,"c");
	ProductService()
	{
		products = new HashSet<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
	}
	
	void addProduct()
	{
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		Product p = new Product(id,name);
		products.add(p);
		
	}
	
	
	void display()
	{
		
		for(Product x : products)
		{
			System.out.println(x);
		}
	}
	
	void searchProduct()
	{
		System.out.println("enter id");
		int pid = sc.nextInt();
		boolean found = false;
		for(Product x : products)
		{
			if(x.id == pid)
			{
				found = true;
				System.out.println(x.name);
				break;
			}
		}
		if(found)
		{
			System.out.println("product found" );
		}
		else
		{
			System.out.println("product not found");
			
		}
	}
	
	void deleteProduct()
	{
		System.out.println("enter id to be deleted");
		int pid = sc.nextInt();
		boolean found = false;
		for(Product x : products)
		{
			if(x.id == pid)
			{
				found = true;
				products.remove(x);
				
				break;
			}
		}
		display();
		
		
	}
	
	
	void updateProduct()
	{
		System.out.println("enter id to be updated");
		int pid = sc.nextInt();
		System.out.println("enter name to be replaced");
		String pname = sc.next();
		
		boolean found = false;
		for(Product x : products)
		{
			if(x.id == pid)
			{
				found = true;
				x.setName(pname);
				
				break;
			}
		}
		display();
		
		
		
	}
}
