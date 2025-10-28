package PuniCoreJavaConcepts.Varibles.Set;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<>();
		
    //HashSet h = new HashSet();

h.add("Puni");
h.add("HashSet");
h.add("Collections");
h.add("Samana");
h.add(null);
// it will print different order.


System.out.println(h);
System.out.println(h.add("Puni"));// Duplicate value--->Boolean Value--->False 



	}

}
