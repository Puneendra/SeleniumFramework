package PuniCoreJavaConcepts.Varibles.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap <String, Integer> fruits = new HashMap<>();
		fruits.put("orange", 10);//1st entry
		fruits.put("Apple", 5);
		fruits.put("Avacado", 15);
		fruits.put(null, 30);
		fruits.put("Mango", 10);
		fruits.put("Banana", null);// all combine entrySet
		
		
		System.out.println(fruits);
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		System.out.println(fruits.entrySet());
		
		
		// let our require ment is orange : 10---> in two ways
		
	
		
		for(Map.Entry<String, Integer> entries : fruits.entrySet())
		{
			System.out.println(entries.getKey() + ":" +entries.getValue());
		}
	System.out.println("------------------------------------------------------------");
	
		
		Set<Map.Entry<String,Integer>> entries = 	fruits.entrySet();
		for (Map.Entry<String,Integer> entrie:entries )
		{
			System.out.println(entrie.getKey() + ":" +entrie.getValue());
		}
		System.out.println("Let using Key Concepts ");// it is a different way
		
		for(String Value : fruits.keySet())
		{
			System.out.println(Value + ":" +fruits.get(Value));
		}
		

	}

}
