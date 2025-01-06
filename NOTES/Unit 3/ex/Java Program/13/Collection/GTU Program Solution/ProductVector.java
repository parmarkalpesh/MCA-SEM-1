package com.pcs;

import java.util.Enumeration;
import java.util.Vector;

public class ProductVector {

	public static void main(String[] args) 
	{
			Product p1 = new Product(1001, "TV", 45670);
			Product p2 = new Product(1002, "Freez", 14560);
			Product p3 = new Product(1003, "Computer", 30000);
			
			Vector<Product> v = new Vector<Product>(5,3);
			v.addElement(p1);
			v.addElement(p2);
			v.addElement(p3);			
			System.out.println("Size = "+v.size());
			System.out.println("Capacity = "+v.capacity());
			
		/*	v.removeElement(p2);
			System.out.println("Size = "+v.size());  */
			
			Enumeration<Product> e = v.elements();
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
	}

}
