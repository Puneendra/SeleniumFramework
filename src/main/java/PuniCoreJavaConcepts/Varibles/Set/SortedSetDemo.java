package PuniCoreJavaConcepts.Varibles.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo 
{

	public static void main(String[] args) 
	{
		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(101);
		ss.add(102);
		ss.add(103);
		ss.add(104);
		ss.add(105);
		ss.add(106);
		ss.add(107);
        ss.add(108);
		ss.add(109);
		ss.add(110);
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(105));// retrive all of the above elements of an current ellement
		System.out.println(ss.tailSet(105));// retrive all of the Below elements of an current ellement
		System.out.println(ss.subSet(101, 108));
		System.out.println(ss.comparator());


		
		


		

		
	}

}
