
package PuniCoreJavaConcepts.Varibles.Set;

import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet tr = new TreeSet();
		//tr.add(null);

       
		tr.add(new StringBuffer("A"));
		tr.add(new StringBuffer("a"));

		tr.add(new StringBuffer("c"));

		tr.add(new StringBuffer("P"));
		//tr.add(null);// here we got null pointer exception
		
		tr.add(new Integer(20));//Class Cast Exception expected but here not coming 
		//HetroGeneous DATA we are storing.

		System.out.println(tr);

	}

}
