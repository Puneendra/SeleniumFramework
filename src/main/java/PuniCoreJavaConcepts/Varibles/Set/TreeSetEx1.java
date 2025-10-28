package PuniCoreJavaConcepts.Varibles.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1
{

	public static void main(String[] args)
	{
TreeSet<String> tr = new TreeSet<>();

tr.add("B");
tr.add("M");
tr.add("W");
tr.add("H");
tr.add("N");
tr.add("C");

System.out.println("TressSet is --->: "+tr);// it will print by default Order 
System.out.println("Celing elemenet to A is ---> "+tr.ceiling("D"));//give here element not present in Set but expected Result must be in set it gives right side
System.out.println("Floor elemenet to E is ---> "+tr.floor("E"));//it checks Leftside
// samme as above we have 2 similar methods 
System.out.println("Hiher Element of D :---->"+tr.higher("D"));
System.out.println("Hiher Element of D :---->"+tr.lower("W"));
System.out.println(tr.first());//it retrves only 1st method
System.out.println(tr.last());//it retrves only Last method

System.out.println("Full SET -----> "+tr);
//System.out.println(tr.pollFirst());//it retrives 1st element but it removes the element
//System.out.println("After the Poll first --->"+tr);
//
//System.out.println(tr.pollLast());//it retrves Last element in set but it removes
//System.out.println("After the Last Poll  --->"+tr);


Iterator<String> itr= tr.descendingIterator();
{
	while(itr.hasNext())
	{
		System.out.print(itr.next());
		
	}
	
}








	}

}
