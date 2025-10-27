package PuniCoreJavaConcepts.Varibles.corejava;

import Varibles.StaticVarible;

public class Demo 
{

	public static void main(String[] args) 
	{
		System.out.println("hi");
		System.out.println("welcome");
		
		/*
		 * System.out.println(StaticVarible.b);
		 * gives error because it is another package and to use same varible in other package
		 * declare as a public 
		 */
		
		System.out.println(StaticVarible.a);

	}

}
