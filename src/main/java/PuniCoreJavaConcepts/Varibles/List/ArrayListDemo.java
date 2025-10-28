package PuniCoreJavaConcepts.Varibles.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> i = new ArrayList<String>();
		i.add("Puni");
		i.add("JAVA");
		i.add(null);
		i.add("Puni");
		
		
		

		System.out.println(i);
		i.remove(3);
		System.out.println(i);
		i.add(3, "Puneendra");
		System.out.println(i);

		Iterator<String>  itr1 = i.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
