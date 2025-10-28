package PuniCoreJavaConcepts.Varibles.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GetSyncrorizedArrayList 
{

	public static void main(String[] args)
{
		ArrayList l1 = new ArrayList();
		
		System.out.println(l1);
		List l = Collections.synchronizedList(l1);
		System.out.println(l);
	
	//public static List synchronizedList(l1);
//		public static Set synchronizedMap(l1);
//		public static Set synchronizedSet(l1);


		
		

	}

}
