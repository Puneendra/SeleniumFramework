package PuniCoreJavaConcepts.Varibles.List;

import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args)
	{
		Vector v = new Vector();
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);
//		v.add(6);
//		v.add(7);
//		v.add(8);
//		v.add(9);
//		v.add(10);
//		System.out.println(v);
//		System.out.println(v.capacity());
//		v.add(11);
//		
//		System.out.println(v);
//		System.out.println(v.capacity());
		for(int i=1; i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(11);
		System.out.println(v);
		System.out.println(v.capacity());
		

		
		
		
	}

}
