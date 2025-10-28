package PuniCoreJavaConcepts.Varibles.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorvAndListIterator
{

    public static void main(String[] args) 
    {
        List<String> Li = new LinkedList<String>();
        Li.add("Java");
        Li.add("Selenium");
        Li.add("Automation");
        Li.add("java selenium automation");

        // 1. Using Iterator (forward only)
        System.out.println("Using Iterator:");
        
        Iterator<String> itr1 = Li.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        // 2. Using ListIterator (forward)
        System.out.println("\nList Iterator starts here (Forward):");
        
        ListIterator<String> itr2 = Li.listIterator();  // ✅ FIXED
        while (itr2.hasNext()) 
        {
            System.out.println(itr2.next());
            System.out.println("Has Next? " + itr2.hasNext());
        }

        // 3. Using ListIterator (backward)
        System.out.println("\nList Iterator (Backward):");
        ListIterator<String> itr3 = Li.listIterator();  // ✅ FIXED
        while (itr3.hasPrevious())
        {
            System.out.println(itr3.previous());
        }
    }
}
