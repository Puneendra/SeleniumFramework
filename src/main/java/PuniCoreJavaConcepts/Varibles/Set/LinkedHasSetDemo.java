package PuniCoreJavaConcepts.Varibles.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetDemo 

{

	public static void main(String[] args)
	{
		LinkedHashSet h = new LinkedHashSet();

		h.add("Puni");
		h.add("HashSet");
		h.add("Collections");
		h.add("Sapu");
		h.add(null);
		// it will print same  order.===>this is the difference in HS LHS


		System.out.println(h);
		System.out.println(h.add("Puni"));// Duplicate value--->Boolean Value--->False 


	}

}
